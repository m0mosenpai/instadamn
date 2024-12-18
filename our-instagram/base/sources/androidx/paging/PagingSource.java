package androidx.paging;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC53592Nmz;
import X.C128085qc;
import X.C14360o3;
import X.C1DS;
import X.C2JS;
import X.C51079Mhb;
import X.C51080Mhe;
import X.C54827OLm;
import X.C54831OLq;
import X.C57587Pgz;
import X.MSW;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubReelsHScrollPagingSource;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import com.instagram.creator.inspiration.repository.graphql.IGCreatorInspirationHubMediaFragmentImpl;
import com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionMediaPagingSource;
import com.instagram.reels.storiestemplate.discovery.repository.StoryTemplateDiscoverySurfaceSectionPagingSource;
import com.instagram.save.repository.SavedAudioPagingSource;
import java.util.AbstractCollection;

/* loaded from: classes9.dex */
public abstract class PagingSource {
    public final C54831OLq A00 = new C54831OLq(null, C57587Pgz.A00);

    public static void A03(C2JS c2js, CreatorInspirationHubReelsHScrollPagingSource creatorInspirationHubReelsHScrollPagingSource, AbstractCollection abstractCollection) {
        C2JS requiredTreeField = c2js.getRequiredTreeField(0, "media", GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.ClipsSectionContentData.ClipsItems.Media.class, -251780288);
        C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.SectionContent.Data.ClipsSectionContentData.ClipsItems.Media");
        abstractCollection.add(C128085qc.A02(((IGCreatorInspirationHubMediaFragmentImpl) requiredTreeField.reinterpretRequired(0, IGCreatorInspirationHubMediaFragmentImpl.class, -1290013599)).A0E(C1DS.A00(creatorInspirationHubReelsHScrollPagingSource.A00))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.2tM] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A04(X.AbstractC54752OHh r36, X.InterfaceC23621Ds r37) {
        /*
            Method dump skipped, instructions count: 2149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingSource.A04(X.OHh, X.1Ds):java.lang.Object");
    }

    public Object A05(C54827OLm c54827OLm) {
        if (!(this instanceof SavedAudioPagingSource) && !(this instanceof C51080Mhe)) {
            if (this instanceof C51079Mhb) {
                ((C51079Mhb) this).A00 = true;
                return null;
            }
            if ((this instanceof StoryTemplateDiscoverySurfaceSectionPagingSource) || (this instanceof StoryTemplateDiscoverySurfaceSectionMediaPagingSource)) {
            }
            return null;
        }
        return null;
    }

    public final void A06() {
        if (this.A00.A02() && AbstractC53592Nmz.A00 != null && MSW.A1a(3)) {
            C14360o3.A0B(AbstractC167017dG.A0n(this, "Invalidated PagingSource ", AbstractC166987dD.A1C()), 1);
        }
    }
}
