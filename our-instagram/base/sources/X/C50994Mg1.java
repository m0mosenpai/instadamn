package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Mg1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50994Mg1 extends AbstractC52922bZ {
    public C2GS A00;
    public EnumC76383bi A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public final C2GS A06;
    public final C2GS A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final UserSession A0D;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.2GT, X.2GS] */
    public C50994Mg1(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0D = userSession;
        this.A08 = MSW.A0E();
        this.A0A = MSW.A0E();
        this.A09 = MSW.A0E();
        this.A07 = MSW.A0E();
        this.A00 = MSW.A0E();
        this.A06 = new C2GT(null);
        C16930sl c16930sl = C16930sl.A00;
        this.A0B = C10E.A00(c16930sl);
        this.A0C = C10E.A00(c16930sl);
        this.A01 = EnumC76383bi.A06;
        this.A05 = c16930sl;
        this.A03 = c16930sl;
        this.A02 = c16930sl;
        this.A04 = c16930sl;
    }

    public final void A01(PeopleTag peopleTag, boolean z) {
        C2GS c2gs = this.A0A;
        ArrayList A0Z = AbstractC50523MSb.A0Z((Collection) c2gs.A02());
        if (z) {
            A0Z.add(0, peopleTag);
        } else {
            A0Z.add(peopleTag);
        }
        c2gs.A0B(A0Z);
        C2GS c2gs2 = this.A08;
        Iterable iterable = (Iterable) c2gs2.A02();
        if (iterable != null) {
            java.util.Set A0j = AbstractC001800i.A0j(iterable);
            if (A0j.remove(peopleTag)) {
                c2gs2.A0B(AbstractC001800i.A0a(A0j));
            }
        }
    }

    public final void A00(PeopleTag peopleTag) {
        java.util.Set A0l;
        C2GS c2gs = this.A0A;
        Collection collection = (Collection) c2gs.A02();
        if (collection != null) {
            ArrayList A1F = AbstractC166987dD.A1F(collection);
            if (A1F.remove(peopleTag)) {
                c2gs.A0B(A1F);
            }
        }
        C2GS c2gs2 = this.A08;
        Iterable iterable = (Iterable) c2gs2.A02();
        if (iterable != null) {
            A0l = AbstractC001800i.A0j(iterable);
        } else {
            A0l = AbstractC31171DnF.A0l();
        }
        A0l.add(peopleTag);
        c2gs2.A0B(AbstractC001800i.A0a(A0l));
    }

    public final void A02(String str) {
        C2GS c2gs = this.A09;
        ArrayList A0Z = AbstractC50523MSb.A0Z((Collection) c2gs.A02());
        A0Z.add(str);
        c2gs.A0B(A0Z);
        C2GS c2gs2 = this.A07;
        Iterable iterable = (Iterable) c2gs2.A02();
        if (iterable != null) {
            java.util.Set A0j = AbstractC001800i.A0j(iterable);
            if (A0j.remove(str)) {
                c2gs2.A0B(AbstractC001800i.A0a(A0j));
            }
        }
    }

    public final void A03(String str) {
        java.util.Set A0l;
        C2GS c2gs = this.A09;
        Collection collection = (Collection) c2gs.A02();
        if (collection != null) {
            ArrayList A1F = AbstractC166987dD.A1F(collection);
            if (A1F.remove(str)) {
                c2gs.A0B(A1F);
            }
        }
        C2GS c2gs2 = this.A07;
        Iterable iterable = (Iterable) c2gs2.A02();
        if (iterable != null) {
            A0l = AbstractC001800i.A0j(iterable);
        } else {
            A0l = AbstractC31171DnF.A0l();
        }
        A0l.add(str);
        c2gs2.A0B(AbstractC001800i.A0a(A0l));
    }
}
