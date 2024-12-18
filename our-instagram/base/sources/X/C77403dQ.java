package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3dQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77403dQ {
    public static final C77403dQ A00 = new Object();

    public static final List A01(SocialContextType socialContextType, UserSession userSession, C38321qM c38321qM, boolean z) {
        InterfaceC87503vI interfaceC87503vI;
        List ByM;
        InterfaceC87483vG interfaceC87483vG;
        Object obj;
        List ByK = c38321qM.A0C.ByK();
        if (ByK != null) {
            Iterator it = ByK.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((InterfaceC87503vI) obj).ByT() == socialContextType) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            interfaceC87503vI = (InterfaceC87503vI) obj;
        } else {
            interfaceC87503vI = null;
        }
        if (z ? !C18U.A06(C06090Tz.A05, userSession, 2342165783859636738L) : C3HM.A01(userSession)) {
            if (interfaceC87503vI == null) {
                return null;
            }
            return interfaceC87503vI.ByM();
        }
        if (interfaceC87503vI == null || (ByM = interfaceC87503vI.ByM()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : ByM) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            List ByL = interfaceC87503vI.ByL();
            if (ByL != null && (interfaceC87483vG = (InterfaceC87483vG) AbstractC001800i.A0O(ByL, i)) != null && C14360o3.A0K(interfaceC87483vG.CVs(), true)) {
                arrayList.add(obj2);
            }
            i = i2;
        }
        return arrayList;
    }

    public static final void A02(Context context, Resources resources, SpannableStringBuilder spannableStringBuilder, UserSession userSession, User user, int i) {
        int i2;
        C14360o3.A0B(resources, 0);
        C14360o3.A0B(userSession, 2);
        List A0U = user.A0U();
        if (A0U != null) {
            Integer BVy = user.A03.BVy();
            if (BVy != null) {
                i2 = BVy.intValue();
            } else {
                i2 = 0;
            }
            A04(resources, spannableStringBuilder, A0U, i, i2);
            C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession);
            c85383rT.A0L = true;
            c85383rT.A01 = AbstractC53242c7.A0F(context, R.attr.textColorBoldLink);
            c85383rT.A0Q = true;
            c85383rT.A03(null);
            c85383rT.A00();
        }
    }

    public static final void A03(Resources resources, SpannableStringBuilder spannableStringBuilder, SocialContextType socialContextType, List list, int i) {
        int i2;
        Object[] objArr;
        int size = list.size();
        if (size > i) {
            size = i;
        }
        int ordinal = socialContextType.ordinal();
        if (size != 1) {
            if (size != 2) {
                if (ordinal != 7) {
                    i2 = 2131953895;
                    if (ordinal != 1) {
                        i2 = 2131965120;
                    }
                } else {
                    i2 = 2131962746;
                }
                objArr = new Object[]{list.get(0), list.get(1), list.get(2)};
            } else {
                if (ordinal != 7) {
                    i2 = 2131953894;
                    if (ordinal != 1) {
                        i2 = 2131965118;
                    }
                } else {
                    i2 = 2131962744;
                }
                objArr = new Object[]{list.get(0), list.get(1)};
            }
        } else {
            if (ordinal != 7) {
                i2 = 2131953893;
                if (ordinal != 1) {
                    i2 = 2131965116;
                }
            } else {
                i2 = 2131962742;
            }
            objArr = new Object[]{list.get(0)};
        }
        spannableStringBuilder.append((CharSequence) resources.getString(i2, objArr));
    }

    public final List A05(UserSession userSession, C38321qM c38321qM) {
        List ByM;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36327658023369480L)) {
            InterfaceC87503vI A002 = A00(c38321qM);
            if (A002 != null && (ByM = A002.ByM()) != null) {
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(ByM, 10));
                Iterator it = ByM.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC101524hN.A00((User) it.next()));
                }
                return arrayList;
            }
            return C16930sl.A00;
        }
        List B47 = c38321qM.A0C.B47();
        if (B47 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(B47, 10));
            Iterator it2 = B47.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AbstractC101524hN.A00((User) it2.next()));
            }
            return arrayList2;
        }
        return null;
    }

    public final List A06(UserSession userSession, C38321qM c38321qM) {
        List ByM;
        C14360o3.A0B(c38321qM, 1);
        if (C18U.A06(C06090Tz.A05, userSession, 36327658023369480L) && !C77153d1.A00(userSession, c38321qM)) {
            InterfaceC87503vI A002 = A00(c38321qM);
            if (A002 != null && (ByM = A002.ByM()) != null) {
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(ByM, 10));
                Iterator it = ByM.iterator();
                while (it.hasNext()) {
                    arrayList.add(((User) it.next()).getUsername());
                }
                List A0d = AbstractC001800i.A0d(arrayList, 1);
                if (A0d != null) {
                    return A0d;
                }
            }
        } else {
            List C9Y = c38321qM.A0C.C9Y();
            if (C9Y != null) {
                return C9Y;
            }
        }
        return C16930sl.A00;
    }

    public final void A09(Resources resources, SpannableStringBuilder spannableStringBuilder, SocialContextType socialContextType, List list, int i, int i2) {
        int i3;
        int i4;
        String[] strArr;
        int size = list.size();
        if (size > i2) {
            size = i2;
        }
        if (size != 1) {
            int ordinal = socialContextType.ordinal();
            if (size != 2) {
                if (ordinal != 7) {
                    i3 = R.plurals.blend_recommended_for_x_y_z_and_n_others;
                    if (ordinal != 1) {
                        i3 = R.plurals.liked_by_x_y_z_and_n_others;
                    }
                } else {
                    i3 = R.plurals.followed_by_x_y_z_and_n_others;
                }
                i4 = i - 3;
                String str = (String) list.get(0);
                String str2 = (String) list.get(1);
                String str3 = (String) list.get(2);
                String format = NumberFormat.getInstance(Locale.getDefault()).format(i4);
                C14360o3.A07(format);
                strArr = new String[]{str, str2, str3, format};
            } else {
                if (ordinal != 7) {
                    i3 = R.plurals.blend_recommended_for_x_y_and_n_others;
                    if (ordinal != 1) {
                        i3 = R.plurals.liked_by_x_y_and_n_others;
                    }
                } else {
                    i3 = R.plurals.followed_by_x_y_and_n_others;
                }
                i4 = i - 2;
                String str4 = (String) list.get(0);
                String str5 = (String) list.get(1);
                String format2 = NumberFormat.getInstance(Locale.getDefault()).format(i4);
                C14360o3.A07(format2);
                strArr = new String[]{str4, str5, format2};
            }
        } else {
            int ordinal2 = socialContextType.ordinal();
            if (ordinal2 != 7) {
                i3 = R.plurals.blend_recommended_for_x_and_n_others;
                if (ordinal2 != 1) {
                    i3 = R.plurals.liked_by_x_and_n_others;
                }
            } else {
                i3 = R.plurals.followed_by_x_and_n_others;
            }
            i4 = i - 1;
            String str6 = (String) list.get(0);
            String format3 = NumberFormat.getInstance(Locale.getDefault()).format(i4);
            C14360o3.A07(format3);
            strArr = new String[]{str6, format3};
        }
        spannableStringBuilder.append((CharSequence) AbstractC07900bA.A02(resources, strArr, i3, i4));
    }

    public static final InterfaceC87503vI A00(C38321qM c38321qM) {
        List ByK = c38321qM.A0C.ByK();
        Object obj = null;
        if (ByK == null) {
            return null;
        }
        Iterator it = ByK.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((InterfaceC87503vI) next).ByT() == SocialContextType.A0C) {
                obj = next;
                break;
            }
        }
        return (InterfaceC87503vI) obj;
    }

    public static final void A04(Resources resources, SpannableStringBuilder spannableStringBuilder, List list, int i, int i2) {
        CharSequence string;
        boolean z = false;
        if (i2 > i) {
            z = true;
        }
        int size = list.size();
        if (size > i) {
            size = i;
        }
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (z) {
                        int i3 = i2 - 3;
                        string = AbstractC07900bA.A02(resources, new String[]{(String) list.get(0), (String) list.get(1), (String) list.get(2), C84963qk.A04(resources, Integer.valueOf(i3), 10000, false, false)}, R.plurals.followed_by_x_y_z_and_n_others, i3);
                    } else {
                        string = resources.getString(2131962746, list.get(0), list.get(1), list.get(2));
                    }
                } else if (z) {
                    int i4 = i2 - 2;
                    string = AbstractC07900bA.A02(resources, new String[]{(String) list.get(0), (String) list.get(1), C84963qk.A04(resources, Integer.valueOf(i4), 10000, false, false)}, R.plurals.followed_by_x_y_and_n_others, i4);
                } else {
                    string = resources.getString(2131962744, list.get(0), list.get(1));
                }
            } else if (z) {
                int i5 = i2 - 1;
                string = AbstractC07900bA.A02(resources, new String[]{(String) list.get(0), C84963qk.A04(resources, Integer.valueOf(i5), 10000, false, false)}, R.plurals.followed_by_x_and_n_others, i5);
            } else {
                string = resources.getString(2131962742, list.get(0));
            }
            spannableStringBuilder.append(string);
            return;
        }
        C0f5 AEp = C18950wb.A01.AEp("exception", 817903143);
        AEp.ABW("error", "usernames list is empty.");
        AEp.report();
    }

    public final List A07(C38321qM c38321qM) {
        List ByM;
        InterfaceC87483vG interfaceC87483vG;
        InterfaceC87503vI A002 = A00(c38321qM);
        if (A002 != null && (ByM = A002.ByM()) != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : ByM) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                List ByL = A002.ByL();
                if (ByL == null || (interfaceC87483vG = (InterfaceC87483vG) AbstractC001800i.A0O(ByL, i)) == null || (!C14360o3.A0K(interfaceC87483vG.CVs(), true))) {
                    arrayList.add(obj);
                }
                i = i2;
            }
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC101524hN.A00((User) it.next()));
            }
            return arrayList2;
        }
        return C16930sl.A00;
    }

    public final List A08(C38321qM c38321qM) {
        int i;
        List ByM;
        InterfaceC87483vG interfaceC87483vG;
        InterfaceC87503vI A002 = A00(c38321qM);
        List C9Y = c38321qM.A0C.C9Y();
        if (C9Y != null) {
            i = C9Y.size();
        } else {
            i = 0;
        }
        if (A002 != null && (ByM = A002.ByM()) != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : ByM) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                List ByL = A002.ByL();
                if (ByL == null || (interfaceC87483vG = (InterfaceC87483vG) AbstractC001800i.A0O(ByL, i2)) == null || (!C14360o3.A0K(interfaceC87483vG.CVs(), true))) {
                    arrayList.add(obj);
                }
                i2 = i3;
            }
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((User) it.next()).getUsername());
            }
            List A0d = AbstractC001800i.A0d(arrayList2, i);
            if (A0d != null) {
                return A0d;
            }
        }
        return C16930sl.A00;
    }
}
