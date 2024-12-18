package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ETT extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C9CK A02;
    public final /* synthetic */ C31338Dq3 A03;
    public final /* synthetic */ C5HW A04;
    public final /* synthetic */ boolean A05;

    public ETT(Context context, C9CK c9ck, C31338Dq3 c31338Dq3, C5HW c5hw, int i, boolean z) {
        this.A03 = c31338Dq3;
        this.A02 = c9ck;
        this.A04 = c5hw;
        this.A00 = i;
        this.A01 = context;
        this.A05 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-119299305);
        C0w9 c0w9 = C0w9.A01;
        Integer num = C05F.A00;
        C9CK c9ck = this.A02;
        c0w9.EHD("NewsfeedInlineSettingsController", num, AnonymousClass001.A0R("inline control network execution failed, action type: ", c9ck.A02));
        C31338Dq3 c31338Dq3 = this.A03;
        if (C31338Dq3.A05(c31338Dq3)) {
            C41451vu c41451vu = C41451vu.A01;
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(this.A01, A0K, 2131968502);
            A0K.A07(R.drawable.instagram_info_pano_outline_24);
            A0K.A02();
            A0K.A06();
            A0K.A02 = 0;
            AbstractC31178DnM.A1N(c41451vu, A0K);
        }
        C31345DqA c31345DqA = c31338Dq3.A07;
        C5HW c5hw = this.A04;
        int i = c5hw.A00;
        String str = c9ck.A02;
        C14360o3.A0B(str, 1);
        c31345DqA.A00.remove(AnonymousClass001.A0H(str, ':', i));
        if (this.A05) {
            c31338Dq3.A06.COe(c5hw, this.A00);
        }
        C31338Dq3.A04(c31338Dq3, c5hw, AnonymousClass001.A0R(c9ck.A02, AbstractC111324zv.A00(1871)), this.A00);
        C0f9.A0A(2023972824, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1537957251);
        int A032 = C0f9.A03(-14904271);
        C31338Dq3.A04(this.A03, this.A04, AnonymousClass001.A0R(this.A02.A02, "_success"), this.A00);
        C0f9.A0A(-329869784, A032);
        C0f9.A0A(-1862058244, A03);
    }
}
