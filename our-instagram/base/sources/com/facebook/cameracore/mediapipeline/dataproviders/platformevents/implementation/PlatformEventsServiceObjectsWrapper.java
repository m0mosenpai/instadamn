package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.BDB;
import X.C14360o3;
import X.C1814883b;
import X.InterfaceC1815083d;
import com.facebook.jni.HybridData;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PlatformEventsServiceObjectsWrapper implements BDB {
    public boolean _isAlive;
    public final InterfaceC1815083d delegate;
    public final C1814883b input;
    public final HybridData mHybridData;

    private final native void enqueueEventNative(String str);

    private final native HybridData initHybrid();

    @Override // X.BDB
    public void enqueueEvent(JSONObject jSONObject) {
        C14360o3.A0B(jSONObject, 0);
        enqueueEventNative(AbstractC166987dD.A19(jSONObject));
    }

    public final void start() {
        BDB bdb;
        this._isAlive = true;
        C1814883b c1814883b = this.input;
        if (c1814883b == null || (bdb = c1814883b.A00) == null || !bdb.isAlive()) {
            return;
        }
        while (true) {
            LinkedList linkedList = c1814883b.A01;
            if (!linkedList.isEmpty()) {
                BDB bdb2 = c1814883b.A00;
                Object pop = linkedList.pop();
                pop.getClass();
                bdb2.enqueueEvent((JSONObject) pop);
            } else {
                return;
            }
        }
    }

    @Override // X.BDB
    public void stop() {
        this._isAlive = false;
        this.mHybridData.resetNative();
    }

    public final void didReceiveEngineEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            InterfaceC1815083d interfaceC1815083d = this.delegate;
            if (interfaceC1815083d != null) {
                interfaceC1815083d.APG(jSONObject);
            }
        } catch (JSONException e) {
            throw AbstractC166987dD.A12(AbstractC167017dG.A0n(e, "Invalid json events from engine: ", AbstractC166987dD.A1C()));
        }
    }

    @Override // X.BDB
    public boolean isAlive() {
        return this._isAlive;
    }

    public PlatformEventsServiceObjectsWrapper(InterfaceC1815083d interfaceC1815083d, C1814883b c1814883b) {
        this.delegate = interfaceC1815083d;
        this.input = c1814883b;
        if (c1814883b != null) {
            c1814883b.A00 = this;
        }
        this.mHybridData = initHybrid();
    }
}
