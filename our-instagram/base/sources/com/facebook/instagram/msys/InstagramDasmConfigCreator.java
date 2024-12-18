package com.facebook.instagram.msys;

import X.C09170dP;
import X.C6Ec;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.simplejni.NativeHolder;
import com.mcftypeholder.McfTypeHolder;

/* loaded from: classes3.dex */
public class InstagramDasmConfigCreator extends DasmConfigCreator {
    public static InstagramDasmConfigCreator sInstance;

    private native NativeHolder createDasmConfigNativeHolder();

    @Override // com.facebook.msys.mcs.DasmConfigCreator
    public native NativeHolder initNativeHolder();

    static {
        C09170dP.A0C("InstagramDasmConfigCreator-jni");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.msys.mcs.DasmConfigCreator, com.facebook.instagram.msys.InstagramDasmConfigCreator] */
    public static InstagramDasmConfigCreator getInstance() {
        InstagramDasmConfigCreator instagramDasmConfigCreator = sInstance;
        if (instagramDasmConfigCreator == null) {
            ?? dasmConfigCreator = new DasmConfigCreator();
            sInstance = dasmConfigCreator;
            return dasmConfigCreator;
        }
        return instagramDasmConfigCreator;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6Ec, com.mcftypeholder.McfTypeHolder] */
    @Override // com.facebook.msys.mcs.DasmConfigCreator
    public C6Ec createDasmConfig() {
        McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
        return new McfTypeHolder(30166406, createDasmConfigNativeHolder());
    }
}
