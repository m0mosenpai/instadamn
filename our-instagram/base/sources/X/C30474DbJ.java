package X;

import android.content.Context;
import com.instagram.api.schemas.AppstoreMetadataDict;

/* renamed from: X.DbJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30474DbJ extends C0YY implements InterfaceC16620sF {
    public static final C30474DbJ A00 = new C30474DbJ();

    public C30474DbJ() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AppstoreMetadataDict AcT;
        C120985dq c120985dq = (C120985dq) obj;
        Context context = (Context) obj2;
        AbstractC167017dG.A1N(c120985dq, context);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null || (AcT = c38321qM.A0C.AcT()) == null) {
            return null;
        }
        return CJG.A00(context, AcT);
    }
}
