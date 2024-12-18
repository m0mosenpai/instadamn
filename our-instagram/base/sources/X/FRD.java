package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRD {
    public final Context A01;
    public final AbstractC018607g A02;
    public final C68814VcV A04;
    public EnumC155676yw A00 = EnumC155676yw.A02;
    public final C31363DqS A03 = new C31363DqS();

    public final void A01(Hashtag hashtag) {
        String str;
        C14360o3.A0B(hashtag, 0);
        List list = this.A03.A00;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next instanceof FOC) {
                    FOC foc = (FOC) next;
                    if (FVZ.A00(foc) != C05F.A00) {
                        continue;
                    } else {
                        Hashtag hashtag2 = foc.A00;
                        if (hashtag2 != null) {
                            str = hashtag2.getId();
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(str, hashtag.getId())) {
                            break;
                        }
                    }
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Object obj = list.get(i);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.interestrecs.model.InterestRecommendationWrapper");
        FOC foc2 = (FOC) obj;
        C14360o3.A0B(foc2, 0);
        C132765yz c132765yz = (C132765yz) foc2.A01;
        String str2 = c132765yz.A02;
        List list2 = c132765yz.A06;
        String str3 = c132765yz.A03;
        String str4 = c132765yz.A04;
        String str5 = c132765yz.A05;
        List list3 = c132765yz.A07;
        User user = c132765yz.A01;
        new C1DY((C1DV) new C37761pD(null), 6, false);
        AbstractC31180DnO.A0w(6);
        list.set(i, new FOC(new C132765yz(hashtag.F59(), user, str2, str3, str4, str5, list2, list3)));
    }

    public final void A00() {
        if (AbstractC166987dD.A1b(this.A03.A00)) {
            this.A00 = EnumC155676yw.A04;
            return;
        }
        this.A00 = EnumC155676yw.A03;
        V1R v1r = this.A04.A00;
        UserSession A00 = V1R.A00(v1r);
        String name = v1r.BD4().getName();
        if (name != null) {
            C25621Ms A0N = AbstractC31173DnH.A0N(A00);
            AbstractC31173DnH.A1Q(A0N, "tags/%s/follow_chaining_recs/", new Object[]{android.net.Uri.encode(name.trim())});
            C1ON A0S = AbstractC31172DnG.A0S(A0N, C32161EBi.class, C34822FVy.class);
            A0S.A00 = EV0.A00(this, 22);
            C1GJ.A00(this.A01, this.A02, A0S);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public FRD(Context context, AbstractC018607g abstractC018607g, C68814VcV c68814VcV) {
        this.A01 = context;
        this.A02 = abstractC018607g;
        this.A04 = c68814VcV;
    }
}
