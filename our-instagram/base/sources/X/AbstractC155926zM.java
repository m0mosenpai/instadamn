package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.GraphGuardianContentImpl;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6zM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC155926zM implements InterfaceC65342xW {
    public GraphGuardianContentImpl A00;
    public boolean A01;
    public final C155946zO A02;
    public final C155376yQ A03;
    public final C155896zJ A04;
    public final EnumC125765mR A05;
    public final UserDetailFragment A06;
    public final List A07;
    public final boolean A08;

    public AbstractC155926zM(Context context, UserSession userSession, C155376yQ c155376yQ, InterfaceC60442pS interfaceC60442pS, C155896zJ c155896zJ, EnumC125765mR enumC125765mR, UserDetailFragment userDetailFragment, C38U c38u, Integer num, boolean z) {
        C14360o3.A0B(c38u, 9);
        this.A06 = userDetailFragment;
        this.A05 = enumC125765mR;
        this.A03 = c155376yQ;
        this.A04 = c155896zJ;
        this.A08 = z;
        this.A02 = new C155946zO(new C155936zN(context, interfaceC60442pS, userSession), c38u, num);
        this.A07 = new ArrayList();
    }

    public static final void A00(AbstractC155926zM abstractC155926zM) {
        Iterator it = abstractC155926zM.A07.iterator();
        while (it.hasNext()) {
            ((C152896uJ) it.next()).A00();
        }
    }

    public FM4 A02() {
        String str;
        C17Q c17q;
        if (!(this instanceof C155916zL) && !(this instanceof C155956zP) && (this instanceof C155966zQ)) {
            C155966zQ c155966zQ = (C155966zQ) this;
            UserSession userSession = c155966zQ.A03;
            if (!C18U.A06(C06090Tz.A05, userSession, 36315872633032347L)) {
                return null;
            }
            String str2 = userSession.userId;
            C155666yv c155666yv = ((AbstractC155926zM) c155966zQ).A04.A02.A0O;
            User user = c155666yv.A0J;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            if (C14360o3.A0K(str2, str)) {
                return null;
            }
            User user2 = c155666yv.A0J;
            if (user2 != null) {
                c17q = user2.A02;
            } else {
                c17q = null;
            }
            if (c17q != C17Q.A03) {
                return null;
            }
            FragmentActivity fragmentActivity = c155966zQ.A00;
            String string = fragmentActivity.getString(2131962133);
            C14360o3.A07(string);
            User user3 = c155666yv.A0J;
            if (user3 != null) {
                String string2 = fragmentActivity.getString(2131962132, user3.getUsername());
                C14360o3.A07(string2);
                return new FM4(new ViewOnClickListenerC35508Flz(c155966zQ), string, string2, fragmentActivity.getString(2131962187));
            }
            throw new IllegalStateException("Required value was null.");
        }
        return null;
    }

    public C1571273r A03() {
        C1571273r c1571273r;
        InterfaceC1571373s gho;
        String string;
        InterfaceC1571373s ghm;
        Context context;
        int i;
        boolean z;
        if (this instanceof C155916zL) {
            C155916zL c155916zL = (C155916zL) this;
            c1571273r = new C1571273r();
            if (c155916zL.A08) {
                c1571273r.A02 = R.drawable.empty_state_plus;
                UserSession userSession = c155916zL.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                int A01 = (int) C18U.A01(c06090Tz, userSession, 36599585287769703L);
                if (A01 != 1) {
                    if (A01 != 2) {
                        context = c155916zL.A00;
                        if (A01 != 3) {
                            c1571273r.A0D = context.getString(2131973258);
                            c1571273r.A07 = context.getString(2131973255);
                            c1571273r.A0C = context.getString(2131973256);
                            z = false;
                            ghm = new C31502Dsm(c155916zL, z);
                            c1571273r.A06 = ghm;
                        } else {
                            i = 2131973261;
                        }
                    } else {
                        Context context2 = c155916zL.A00;
                        c1571273r.A0D = context2.getString(2131973260);
                        c1571273r.A0C = context2.getString(2131973257);
                        c1571273r.A0K = true;
                        c1571273r.A0I = true;
                        c1571273r.A0J = C18U.A06(c06090Tz, userSession, 36318110311913366L);
                        z = true;
                        ghm = new C31502Dsm(c155916zL, z);
                        c1571273r.A06 = ghm;
                    }
                } else {
                    context = c155916zL.A00;
                    i = 2131973259;
                }
                c1571273r.A0D = context.getString(i);
                c1571273r.A0C = context.getString(2131973257);
                c1571273r.A0K = true;
                c1571273r.A0I = true;
                z = true;
                ghm = new C31502Dsm(c155916zL, z);
                c1571273r.A06 = ghm;
            } else {
                c1571273r.A02 = R.drawable.empty_state_camera;
                string = c155916zL.A00.getString(2131968586);
                c1571273r.A0D = string;
                return c1571273r;
            }
        } else if (this instanceof C155956zP) {
            C155956zP c155956zP = (C155956zP) this;
            c1571273r = new C1571273r();
            c1571273r.A02 = R.drawable.empty_state_tag;
            if (c155956zP.A08) {
                boolean A06 = C18U.A06(C06090Tz.A05, c155956zP.A01, 36318110311192460L);
                Context context3 = c155956zP.A00;
                Resources resources = context3.getResources();
                if (A06) {
                    c1571273r.A0D = resources.getString(2131969871);
                    c1571273r.A0K = true;
                    c1571273r.A0I = true;
                    c1571273r.A0C = context3.getResources().getString(2131960983);
                    ghm = new GHM(c155956zP);
                    c1571273r.A06 = ghm;
                } else {
                    c1571273r.A0D = resources.getString(2131969607);
                    c1571273r.A07 = context3.getResources().getString(2131969608);
                    return c1571273r;
                }
            } else {
                string = c155956zP.A00.getResources().getString(2131969620);
                c1571273r.A0D = string;
                return c1571273r;
            }
        } else if (this instanceof C155966zQ) {
            C155966zQ c155966zQ = (C155966zQ) this;
            User user = ((AbstractC155926zM) c155966zQ).A04.A02.A0O.A0J;
            c1571273r = null;
            if (user != null) {
                if (C14360o3.A0K(user.getId(), c155966zQ.A03.userId)) {
                    return c155966zQ.A04;
                }
                C17Q c17q = user.A02;
                C17Q c17q2 = C17Q.A06;
                C1571273r c1571273r2 = new C1571273r();
                c1571273r2.A02 = R.drawable.instagram_crown_outline_96;
                if (c17q == c17q2) {
                    c1571273r2.A0B = 2131962191;
                    c1571273r2.A07 = c155966zQ.A00.getResources().getString(2131962190, user.getUsername());
                    gho = new GHL(c155966zQ);
                } else {
                    FragmentActivity fragmentActivity = c155966zQ.A00;
                    c1571273r2.A0D = fragmentActivity.getResources().getString(2131962174);
                    c1571273r2.A07 = fragmentActivity.getResources().getString(2131962173, user.getUsername());
                    c1571273r2.A0C = fragmentActivity.getResources().getString(2131962172);
                    gho = new GHO(c155966zQ, user);
                }
                c1571273r2.A06 = gho;
                return c1571273r2;
            }
        } else {
            return null;
        }
        return c1571273r;
    }

    @Override // X.InterfaceC65342xW
    public final Iterator EWm(InterfaceC61752rc interfaceC61752rc) {
        return this.A02.EWm(interfaceC61752rc);
    }
}
