package X;

import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.5Z8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Z8 extends C5Ti {
    public static final C5Z8 A00 = new C5Ti(1, 1);

    public C5Z8() {
        super(1, 1);
    }

    @Override // X.C5Ti
    public final String A00(int i) {
        if (i == 0) {
            return "groupSlotIndex";
        }
        return AnonymousClass001.A0I("IntParameter(", ')', i);
    }

    @Override // X.C5Ti
    public final String A01(int i) {
        if (i == 0) {
            return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
        }
        return AnonymousClass001.A0I("ObjectParameter(", ')', i);
    }
}
