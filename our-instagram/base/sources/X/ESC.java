package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ESC extends AbstractC65632xz {
    public final String A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC37182GZt A04;
    public final InterfaceC37183GZu A05;
    public final InterfaceC37184GZv A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0134, code lost:
    
        if (r3.A08() == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        if (r36.A0D != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0241, code lost:
    
        if (r0.length() == 0) goto L78;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r37, android.view.View r38, java.lang.Object r39, java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESC.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        E72 e72 = (E72) obj;
        anonymousClass306.A7a(0);
        String str = this.A00;
        if (str != null) {
            com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) e72.A00;
            if ((tag instanceof PeopleTag) && tag.getId().equals(str)) {
                anonymousClass306.A7a(1);
            }
        }
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        FBUserTag.FBUserInfo fBUserInfo;
        com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) ((E72) obj).A00;
        if (tag instanceof PeopleTag) {
            PeopleTag peopleTag = (PeopleTag) tag;
            UserSession userSession = this.A03;
            AbstractC167007dF.A1K(userSession, peopleTag);
            User A02 = AnonymousClass189.A00(userSession).A02(peopleTag.getId());
            if (A02 == null) {
                A02 = AnonymousClass189.A00(userSession).A01(peopleTag.A07(), false, false);
            }
            if (!this.A0G) {
                if (peopleTag.A08() == null) {
                    return Integer.MIN_VALUE;
                }
                return peopleTag.A08().hashCode();
            }
            return A02.B7L().ordinal();
        }
        if (!(tag instanceof FBUserTag) || (fBUserInfo = ((FBUserTag) tag).A02) == null) {
            return Integer.MIN_VALUE;
        }
        return fBUserInfo.hashCode();
    }

    public ESC(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37182GZt interfaceC37182GZt, InterfaceC37183GZu interfaceC37183GZu, InterfaceC37184GZv interfaceC37184GZv, Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A06 = interfaceC37184GZv;
        this.A07 = num;
        this.A0G = z;
        this.A0F = z2;
        this.A0E = z3;
        this.A00 = str;
        this.A05 = interfaceC37183GZu;
        this.A0B = str2;
        this.A0D = z4;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A04 = interfaceC37182GZt;
        this.A0C = str6;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A01;
        int i2;
        int A03 = C0f9.A03(-740423777);
        if (i != 0) {
            if (i == 1) {
                Context context = this.A01;
                A01 = LayoutInflater.from(context).inflate(R.layout.row_copyright_attribution_description, viewGroup, AbstractC31175DnJ.A1T(1, context, viewGroup));
                C14360o3.A0C(A01, AbstractC111324zv.A00(2));
                A01.setTag(new C34528FJo(A01));
                i2 = -1560999054;
            } else {
                IllegalArgumentException A0n = AbstractC25230BEn.A0n("viewType does not exist: ", i);
                C0f9.A0A(-94675492, A03);
                throw A0n;
            }
        } else {
            A01 = AbstractC35187Fff.A01(this.A01, viewGroup);
            i2 = 696759584;
        }
        C0f9.A0A(i2, A03);
        return A01;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return AbstractC31171DnF.A0g(obj).hashCode();
    }
}
