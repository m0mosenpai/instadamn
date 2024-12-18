package X;

import android.content.Context;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class ETR extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public ETR(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = obj3;
        this.A05 = z;
        this.A03 = obj2;
        this.A01 = obj;
        this.A04 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(664063619);
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                int i2 = directShareSheetFragment.A0A - 1;
                directShareSheetFragment.A0A = i2;
                if (i2 == 0) {
                    if (this.A05) {
                        DirectShareSheetFragment.A0L(directShareSheetFragment, (List) this.A03);
                    } else {
                        DirectShareSheetFragment.A0H(directShareSheetFragment, (FQ1) this.A02, (List) this.A03);
                    }
                }
                i = -2062106443;
                break;
            case 1:
                A03 = C0f9.A03(-1634085865);
                C9GR.A0D((Context) this.A02, "presence_settings_failed");
                ((GZQ) this.A01).DFf();
                i = 1701470027;
                break;
            default:
                A03 = C0f9.A03(-2054428688);
                C9GR.A0A((Context) this.A01, "edit_media_level_remix_setting_failed");
                i = -636750915;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e5, code lost:
    
        if (r9 != false) goto L30;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ETR.onSuccess(java.lang.Object):void");
    }
}
