package X;

import com.instagram.tagging.activity.TaggingActivity;

/* loaded from: classes9.dex */
public final class NX4 extends AbstractC56025Otw {
    public final /* synthetic */ TaggingActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NX4(TaggingActivity taggingActivity) {
        super(taggingActivity);
        this.A00 = taggingActivity;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(892859075);
        NYB nyb = (NYB) obj;
        int A0N = AbstractC167017dG.A0N(nyb, 699801986);
        TaggingActivity taggingActivity = this.A00;
        String str = nyb.A01;
        if (str == null) {
            str = "";
        }
        TaggingActivity.A0N(taggingActivity, nyb.A00, str);
        C0f9.A0A(-620666010, A0N);
        C0f9.A0A(377483842, A03);
    }
}
