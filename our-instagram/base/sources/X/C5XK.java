package X;

import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.5XK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XK extends C5Ti {
    public static final C5XK A00 = new C5XK();

    public C5XK() {
        super(0, 2);
    }

    @Override // X.C5Ti
    public final String A01(int i) {
        if (i == 0) {
            return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
        }
        if (i == 1) {
            return "block";
        }
        return AnonymousClass001.A0I("ObjectParameter(", ')', i);
    }
}
