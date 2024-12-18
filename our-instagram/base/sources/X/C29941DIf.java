package X;

import android.content.res.Resources;

/* renamed from: X.DIf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29941DIf extends C0YY implements InterfaceC16660sJ {
    public static final C29941DIf A00 = new C29941DIf();

    public C29941DIf() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Resources resources = (Resources) obj;
        C14360o3.A0B(resources, 0);
        return Boolean.valueOf(AbstractC167007dF.A1P(resources.getConfiguration().uiMode & 48, 32));
    }
}
