package X;

import android.content.Context;
import com.instagram.igds.components.snackbar.IgdsSnackBar;

/* renamed from: X.V3k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67945V3k extends C1P1 {
    public final Context A00;
    public final XBJ A01;
    public final U28 A02;

    public C67945V3k(Context context, XBJ xbj, U28 u28) {
        this.A00 = context;
        this.A02 = u28;
        this.A01 = xbj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(2053807631);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        this.A01.EKb();
        Context context = this.A00;
        if (context != null) {
            new IgdsSnackBar(context, null, 0);
            U28 u28 = this.A02;
            if (u28 != null) {
                i = u28.A00;
            } else {
                i = 0;
            }
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A05();
            c146106i8.A0H = "search_history_clear_fail";
            c146106i8.A0D = context.getResources().getString(2131973017);
            c146106i8.A02 = i;
            AbstractC25233BEq.A1F(c146106i8);
        }
        C0f9.A0A(266616955, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1224825882);
        int A0N = AbstractC167017dG.A0N(obj, -1874973704);
        super.onSuccess(obj);
        C0f9.A0A(-1702269406, A0N);
        C0f9.A0A(-805891766, A03);
    }
}
