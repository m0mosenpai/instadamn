package X;

import android.content.res.Resources;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;

/* renamed from: X.EdZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32892EdZ extends VKF {
    public final /* synthetic */ C36684GFe A00;
    public final /* synthetic */ FRO A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C32892EdZ(C36684GFe c36684GFe, FRO fro, String str, String str2) {
        this.A00 = c36684GFe;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = fro;
    }

    @Override // X.VKF
    public final void A03() {
        C36684GFe c36684GFe = this.A00;
        DirectSearchInboxFragment directSearchInboxFragment = c36684GFe.A0S;
        Integer num = C05F.A0K;
        C28511Zm c28511Zm = C28531Zo.A04.A01;
        Resources resources = c36684GFe.A0M.getResources();
        AbstractC31265Don.A00();
        directSearchInboxFragment.A04(c28511Zm.A03(resources.getString(2131960402), this.A03, this.A02, null, null, null, null, null, this.A01.A01, 36, -1), num);
    }
}
