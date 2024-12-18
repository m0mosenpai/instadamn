package X;

import com.instagram.tagging.activity.TaggingActivity;

/* renamed from: X.Otw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC56025Otw implements InterfaceC42271xH {
    public final /* synthetic */ TaggingActivity A00;

    public AbstractC56025Otw(TaggingActivity taggingActivity) {
        this.A00 = taggingActivity;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        String str;
        AbstractC56014Otl abstractC56014Otl = (AbstractC56014Otl) obj;
        C14360o3.A0B(abstractC56014Otl, 0);
        if (abstractC56014Otl.A00 == C05F.A01 && (str = abstractC56014Otl.A01) != null) {
            TaggingActivity taggingActivity = this.A00;
            if (taggingActivity.A0m.containsKey(str) || taggingActivity.A0n.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
