package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoTextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;

/* loaded from: classes11.dex */
public final class V90 extends C17T implements InterfaceC99404dC {
    @Override // X.InterfaceC99404dC
    public final TextAppSearchDiscussionTopic AyN() {
        return (TextAppSearchDiscussionTopic) A05(-1932673435, ImmutablePandoTextAppSearchDiscussionTopic.class);
    }

    @Override // X.InterfaceC99404dC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(VP9.A00(this), this);
    }

    @Override // X.InterfaceC99404dC
    public final Integer Bm9() {
        return getOptionalIntValueByHashCode(-1005155355);
    }

    @Override // X.InterfaceC99404dC
    public final String BmA() {
        return A0i(1961098136);
    }

    @Override // X.InterfaceC99404dC
    public final String CAy() {
        return A0i(-521591601);
    }

    @Override // X.InterfaceC99404dC
    public final URP F2x() {
        TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl;
        TextAppSearchDiscussionTopic AyN = AyN();
        if (AyN != null) {
            textAppSearchDiscussionTopicImpl = AyN.F2y();
        } else {
            textAppSearchDiscussionTopicImpl = null;
        }
        return new URP(textAppSearchDiscussionTopicImpl, getOptionalIntValueByHashCode(-1005155355), A0i(1961098136), A0i(-521591601));
    }
}
