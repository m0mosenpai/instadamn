package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PJW implements C8EZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PJW(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C8EZ
    public final void DJ8(boolean z) {
        C54800OJu c54800OJu;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod;
        DialogInterface.OnDismissListener onDismissListener;
        C145186gd c145186gd;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2;
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            C55908Orz c55908Orz = (C55908Orz) obj;
            Activity activity = c55908Orz.A01;
            UserSession userSession = c55908Orz.A07;
            AbstractC10360h2 abstractC10360h2 = c55908Orz.A04;
            C08790ch A00 = AbstractC018607g.A00(c55908Orz.A03);
            C38321qM c38321qM = c55908Orz.A08;
            if (c38321qM != null) {
                c54800OJu = new C54800OJu(activity, abstractC10360h2, A00, userSession, c38321qM);
                if (z) {
                    mediaGenAIDetectionMethod2 = MediaGenAIDetectionMethod.A0C;
                } else {
                    mediaGenAIDetectionMethod2 = MediaGenAIDetectionMethod.A0B;
                }
                c54800OJu.A02 = mediaGenAIDetectionMethod2;
                onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                c145186gd = c55908Orz.A0F;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            C55909Os0 c55909Os0 = (C55909Os0) obj;
            Activity activity2 = c55909Os0.A04;
            UserSession userSession2 = c55909Os0.A0B;
            AbstractC10360h2 abstractC10360h22 = c55909Os0.A07;
            C08790ch A002 = AbstractC018607g.A00(c55909Os0.A06);
            C38321qM c38321qM2 = c55909Os0.A0F.A0b;
            if (c38321qM2 != null) {
                c54800OJu = new C54800OJu(activity2, abstractC10360h22, A002, userSession2, c38321qM2);
                if (z) {
                    mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.A0C;
                } else {
                    mediaGenAIDetectionMethod = MediaGenAIDetectionMethod.A0B;
                }
                c54800OJu.A02 = mediaGenAIDetectionMethod;
                onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                c145186gd = c55909Os0.A0N;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        c54800OJu.A00(onDismissListener, c145186gd);
    }
}
