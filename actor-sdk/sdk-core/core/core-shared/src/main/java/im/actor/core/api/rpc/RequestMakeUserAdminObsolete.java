package im.actor.core.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.*;

public class RequestMakeUserAdminObsolete extends Request<ResponseMakeUserAdminObsolete> {

    public static final int HEADER = 0xd6;
    public static RequestMakeUserAdminObsolete fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestMakeUserAdminObsolete(), data);
    }

    private ApiGroupOutPeer groupPeer;
    private ApiUserOutPeer userPeer;

    public RequestMakeUserAdminObsolete(@NotNull ApiGroupOutPeer groupPeer, @NotNull ApiUserOutPeer userPeer) {
        this.groupPeer = groupPeer;
        this.userPeer = userPeer;
    }

    public RequestMakeUserAdminObsolete() {

    }

    @NotNull
    public ApiGroupOutPeer getGroupPeer() {
        return this.groupPeer;
    }

    @NotNull
    public ApiUserOutPeer getUserPeer() {
        return this.userPeer;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.groupPeer = values.getObj(1, new ApiGroupOutPeer());
        this.userPeer = values.getObj(2, new ApiUserOutPeer());
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.groupPeer == null) {
            throw new IOException();
        }
        writer.writeObject(1, this.groupPeer);
        if (this.userPeer == null) {
            throw new IOException();
        }
        writer.writeObject(2, this.userPeer);
    }

    @Override
    public String toString() {
        String res = "rpc MakeUserAdminObsolete{";
        res += "groupPeer=" + this.groupPeer;
        res += ", userPeer=" + this.userPeer;
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}