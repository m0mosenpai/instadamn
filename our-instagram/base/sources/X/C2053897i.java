package X;

import com.facebook.ppml.enigma.EnigmaSQLite;

/* renamed from: X.97i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2053897i extends C0YY implements InterfaceC16820sZ {
    public static final C2053897i A00 = new C2053897i();

    public C2053897i() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C2053997k c2053997k = EnigmaSQLite.Companion;
        String path = AbstractC23881Ey.A00().AXd(null, 150323946).getPath();
        C14360o3.A07(path);
        return new EnigmaSQLite(EnigmaSQLite.initHybrid0(path, 2));
    }
}
