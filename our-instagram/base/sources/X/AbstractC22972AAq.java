package X;

import android.os.Bundle;

/* renamed from: X.AAq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22972AAq {
    public static AbstractC22972AAq A00;

    public abstract InterfaceC25196BCt A01();

    public static Bundle A00() {
        Object newInstance = Class.forName("com.instagram.dogfoodingassistant.impl.DogfoodingAssistantPluginImpl").newInstance();
        C14360o3.A0C(newInstance, "null cannot be cast to non-null type com.instagram.dogfoodingassistant.intf.DogfoodingAssistantPlugin");
        AbstractC22972AAq abstractC22972AAq = (AbstractC22972AAq) newInstance;
        C14360o3.A0B(abstractC22972AAq, 0);
        A00 = abstractC22972AAq;
        Bundle bundle = new Bundle();
        bundle.putString(MSV.A00(4), AbstractC111324zv.A00(2290));
        return bundle;
    }
}
