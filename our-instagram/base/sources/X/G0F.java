package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;

/* loaded from: classes6.dex */
public final class G0F implements XCU {
    public final int A00;
    public final Object A01;

    public G0F(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XCU
    public final void onFailure(Exception exc) {
        Activity activity;
        String A00;
        switch (this.A00) {
            case 2:
                activity = ((C34621FNe) this.A01).A02;
                A00 = MSV.A00(88);
                C9GR.A0C(activity, A00);
                return;
            case 3:
                C47936LFk.A00((C47936LFk) this.A01);
                return;
            case 4:
                activity = ((FQL) this.A01).A03;
                A00 = "shareToStory_unknown_error_occured";
                C9GR.A0C(activity, A00);
                return;
            case 5:
                activity = ((C34622FNf) this.A01).A02;
                A00 = "shareToStory_unknown_error_occured";
                C9GR.A0C(activity, A00);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Bundle A0C;
        UserSession userSession;
        Class<TransparentModalActivity> cls;
        Activity activity;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(obj, 0);
                AbstractC25225BEi.A1U(this.A01, obj);
                return;
            case 1:
                C14360o3.A0B(obj, 0);
                ((NOV) this.A01).A08.Egh(obj);
                return;
            case 2:
                File file = (File) obj;
                A0C = AbstractC31177DnL.A0C(file);
                C34621FNe c34621FNe = (C34621FNe) this.A01;
                RectF rectF = c34621FNe.A00;
                if (rectF == null) {
                    rectF = (RectF) c34621FNe.A05.getValue();
                }
                A0C.putParcelable(AbstractC111324zv.A00(331), rectF);
                RectF rectF2 = c34621FNe.A01;
                if (rectF2 == null) {
                    rectF2 = (RectF) c34621FNe.A05.getValue();
                }
                A0C.putParcelable(AbstractC111324zv.A00(332), rectF2);
                A0C.putString(AbstractC111324zv.A00(333), file.getCanonicalPath());
                A0C.putParcelable(AbstractC111324zv.A00(1764), c34621FNe.A04);
                A0C.putParcelable(AbstractC111324zv.A00(334), null);
                userSession = c34621FNe.A03;
                cls = TransparentModalActivity.class;
                activity = c34621FNe.A02;
                AbstractC31173DnH.A0v(activity, A0C, userSession, cls, AbstractC111324zv.A00(5183));
                return;
            case 3:
                File A0Z = AbstractC166997dE.A0Z(obj);
                C47936LFk c47936LFk = (C47936LFk) this.A01;
                c47936LFk.A00.A07 = A0Z.getCanonicalPath();
                C47936LFk.A00(c47936LFk);
                return;
            case 4:
                File file2 = (File) obj;
                A0C = AbstractC166987dD.A0b();
                FQL fql = (FQL) this.A01;
                A0C.putSerializable(AbstractC111324zv.A00(1765), C22P.A3q);
                RectF rectF3 = fql.A01;
                if (rectF3 == null && (rectF3 = fql.A00) == null) {
                    Activity activity2 = fql.A03;
                    int A0A = AbstractC13880nE.A0A(activity2);
                    rectF3 = new RectF(0.0f, AbstractC13880nE.A09(activity2), A0A, r0 * 2);
                    fql.A00 = rectF3;
                }
                A0C.putParcelable(AbstractC111324zv.A00(331), rectF3);
                RectF rectF4 = fql.A02;
                if (rectF4 == null && (rectF4 = fql.A00) == null) {
                    Activity activity3 = fql.A03;
                    int A0A2 = AbstractC13880nE.A0A(activity3);
                    rectF4 = new RectF(0.0f, AbstractC13880nE.A09(activity3), A0A2, r0 * 2);
                    fql.A00 = rectF4;
                }
                A0C.putParcelable(AbstractC111324zv.A00(332), rectF4);
                A0C.putString(AbstractC111324zv.A00(333), file2.getAbsolutePath());
                A0C.putParcelable(AbstractC111324zv.A00(1767), fql.A05);
                A0C.putBoolean(AbstractC111324zv.A00(1766), false);
                A0C.putParcelable(AbstractC111324zv.A00(1769), null);
                A0C.putParcelable(AbstractC111324zv.A00(334), null);
                userSession = fql.A04;
                cls = TransparentModalActivity.class;
                activity = fql.A03;
                AbstractC31173DnH.A0v(activity, A0C, userSession, cls, AbstractC111324zv.A00(5183));
                return;
            default:
                File file3 = (File) obj;
                A0C = AbstractC31177DnL.A0C(file3);
                C34622FNf c34622FNf = (C34622FNf) this.A01;
                RectF rectF5 = c34622FNf.A00;
                if (rectF5 == null) {
                    rectF5 = (RectF) c34622FNf.A05.getValue();
                }
                A0C.putParcelable(AbstractC111324zv.A00(331), rectF5);
                RectF rectF6 = c34622FNf.A01;
                if (rectF6 == null) {
                    rectF6 = (RectF) c34622FNf.A05.getValue();
                }
                A0C.putParcelable(AbstractC111324zv.A00(332), rectF6);
                A0C.putString(AbstractC111324zv.A00(333), file3.getCanonicalPath());
                A0C.putParcelable(AbstractC111324zv.A00(1768), c34622FNf.A04);
                A0C.putParcelable(AbstractC111324zv.A00(334), null);
                userSession = c34622FNf.A03;
                cls = TransparentModalActivity.class;
                activity = c34622FNf.A02;
                AbstractC31173DnH.A0v(activity, A0C, userSession, cls, AbstractC111324zv.A00(5183));
                return;
        }
    }
}
