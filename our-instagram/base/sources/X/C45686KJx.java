package X;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.KJx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45686KJx extends C2AH {
    public final /* synthetic */ LLI A00;
    public final /* synthetic */ boolean A01;

    public C45686KJx(LLI lli, boolean z) {
        this.A00 = lli;
        this.A01 = z;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C9GR.A0A(this.A00.A04, "SHARE_QR_CODE_error");
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        android.net.Uri uri = (android.net.Uri) obj;
        C14360o3.A0B(uri, 0);
        LLI lli = this.A00;
        boolean z = this.A01;
        Intent intent = new Intent(MSV.A00(81));
        intent.putExtra("android.intent.extra.TEXT", AbstractC08820cl.A03(lli.A0F));
        if (z) {
            str = "image/png";
        } else {
            str = "image/jpeg";
        }
        intent.setType(str);
        intent.putExtra(MSV.A00(19), uri);
        intent.setFlags(1);
        intent.setClipData(ClipData.newRawUri("QR code", uri));
        Context context = lli.A04;
        C12260kU.A0E(context, Intent.createChooser(intent, context.getString(2131973639)));
        C47356Kw5 c47356Kw5 = lli.A09;
        if (c47356Kw5 != null) {
            C32284EJv c32284EJv = c47356Kw5.A00;
            C142846ck A00 = AbstractC147806l5.A00(c32284EJv.A09());
            int i = c32284EJv.requireArguments().getInt("DirectThreadInviteLinkSettingsFragment.ARGUMENT_AUDIENCE_TYPE");
            String A07 = AbstractC1345466e.A07(C32284EJv.A00(c32284EJv));
            String A02 = C32284EJv.A02(c32284EJv);
            boolean A08 = C32284EJv.A08(c32284EJv);
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1I(A0I, "share_qr_code");
                A0I.A0o("share_qr_code_button");
                if (A08) {
                    str2 = "creator_qr_code_sheet";
                } else {
                    str2 = "fan_qr_code_sheet";
                }
                A0I.A0h(AbstractC31179DnN.A0a(A0I, str2, A07, A02, i));
                A0I.Cht();
            }
        }
    }
}
