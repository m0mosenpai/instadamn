package X;

import android.os.Bundle;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;

/* renamed from: X.VQc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68420VQc {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Vi0, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.model.hashtag.Hashtag");
        Hashtag hashtag = (Hashtag) A03;
        String A0e = AbstractC31177DnL.A0e(c6fw, 1);
        String A0j = AbstractC167017dG.A0j();
        Bundle bundle = new Bundle();
        ?? obj = new Object();
        obj.A00 = null;
        obj.A02 = new ArrayList();
        obj.A01 = null;
        SectionPagination sectionPagination = new SectionPagination(obj);
        EnumC68206VFy enumC68206VFy = EnumC68206VFy.A08;
        String name = hashtag.getName();
        if (name == null) {
            name = "";
        }
        bundle.putParcelable("contextual_feed_config", new HashtagContextualFeedConfig(new EntityContextualFeedConfig(sectionPagination, enumC68206VFy, null, name, null, 0, 10, true), hashtag, A0j, A0e));
        ArrayList A0z = AbstractC31174DnI.A0z(A0e);
        C140966Yy A0F = AbstractC31180DnO.A0F(c6fq);
        C31569Dtv A00 = AbstractC34365FDh.A00("feed_contextual_hashtag");
        A00.A06 = "Hashtag";
        A00.A0A(A0z);
        A00.A08 = A0e;
        A00.A01 = bundle;
        A00.A0A = A0j;
        AbstractC31175DnJ.A0s(null, A00.A08(), A0F);
        return null;
    }
}
