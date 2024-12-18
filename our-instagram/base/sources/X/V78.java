package X;

import android.content.res.Resources;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;

/* loaded from: classes11.dex */
public final class V78 extends AbstractC202868y4 implements C6S2 {
    public final Hashtag A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V78(Hashtag hashtag, int i) {
        super(i);
        C14360o3.A0B(hashtag, 2);
        this.A00 = hashtag;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.WiV, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = ((AbstractC202868y4) this).A01;
        HashtagImpl F59 = this.A00.F59();
        ?? obj = new Object();
        obj.A00 = i;
        obj.A01 = F59;
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V78(Resources resources, Hashtag hashtag) {
        super(resources);
        AbstractC167017dG.A1P(resources, hashtag);
        this.A00 = hashtag;
    }
}
