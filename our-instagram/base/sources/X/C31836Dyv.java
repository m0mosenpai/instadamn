package X;

import android.os.Bundle;
import com.instagram.common.gallery.Medium;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.prompts.DirectPromptTypes;

/* renamed from: X.Dyv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31836Dyv extends AbstractC52922bZ {
    public Medium A00;
    public String A01;
    public final int A02;
    public final DirectPromptTypes A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final C05A A08;
    public final C05A A09;

    public C31836Dyv(Bundle bundle) {
        C14360o3.A0B(bundle, 1);
        String string = bundle.getString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if (string != null) {
            this.A06 = string;
            this.A03 = DirectPromptTypes.A06;
            String A0b = AbstractC31171DnF.A0b(bundle);
            this.A04 = A0b == null ? "" : A0b;
            String string2 = bundle.getString("card_gallery_collection_title");
            this.A05 = string2 == null ? "" : string2;
            this.A02 = bundle.getInt("direct_channel_audience_type");
            String string3 = bundle.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_V2_ID");
            this.A07 = string3 == null ? "" : string3;
            this.A01 = "";
            this.A08 = AbstractC25235BEs.A1A(false);
            this.A09 = AbstractC25225BEi.A1H(EnumC33378EpB.A04);
            return;
        }
        throw AbstractC31172DnG.A0t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (X.AbstractC001900j.A0T(X.AbstractC25228BEl.A1A(r4.A01)) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4.A00 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        X.AbstractC166997dE.A1Y(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C31836Dyv r4) {
        /*
            X.05A r3 = r4.A08
            X.05A r0 = r4.A09
            java.lang.Object r0 = r0.getValue()
            X.EpB r0 = (X.EnumC33378EpB) r0
            int r2 = r0.ordinal()
            r1 = 0
            if (r2 == r1) goto L1d
            r0 = 1
            if (r2 != r0) goto L2a
            com.instagram.common.gallery.Medium r0 = r4.A00
            if (r0 == 0) goto L19
        L18:
            r1 = 1
        L19:
            X.AbstractC166997dE.A1Y(r3, r1)
            return
        L1d:
            java.lang.String r0 = r4.A01
            java.lang.String r0 = X.AbstractC25228BEl.A1A(r0)
            boolean r0 = X.AbstractC001900j.A0T(r0)
            if (r0 != 0) goto L19
            goto L18
        L2a:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31836Dyv.A00(X.Dyv):void");
    }
}
