package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101514hM {
    public static final C101514hM A00 = new Object();

    public static final SpannableStringBuilder A00(Context context, InterfaceC87503vI interfaceC87503vI, UserSession userSession, C38321qM c38321qM) {
        String A0D;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC87503vI, 3);
        List ByM = interfaceC87503vI.ByM();
        int socialContextUsersCount = interfaceC87503vI.getSocialContextUsersCount();
        SocialContextType ByT = interfaceC87503vI.ByT();
        C14360o3.A0B(ByM, 3);
        C14360o3.A0B(ByT, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = ByM.iterator();
        while (it.hasNext()) {
            String username = ((User) it.next()).getUsername();
            if (ByT == SocialContextType.A04 && C14360o3.A0K(C08730cb.A00(userSession).A00().getUsername(), username)) {
                A0D = context.getResources().getString(2131953896);
                C14360o3.A0A(A0D);
            } else {
                A0D = AnonymousClass001.A0D(username, '@');
            }
            arrayList.add(A0D);
        }
        if (socialContextUsersCount <= ByM.size() && socialContextUsersCount <= 2) {
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            C77403dQ.A03(resources, spannableStringBuilder, ByT, arrayList, 2);
        } else {
            C77403dQ c77403dQ = C77403dQ.A00;
            Resources resources2 = context.getResources();
            C14360o3.A07(resources2);
            c77403dQ.A09(resources2, spannableStringBuilder, ByT, arrayList, socialContextUsersCount, 1);
        }
        C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession);
        c85383rT.A0F = "sans-serif-medium";
        c85383rT.A01 = -1;
        c85383rT.A0Q = true;
        if (ByT == SocialContextType.A04) {
            c85383rT.A0R = true;
        } else {
            c85383rT.A03(new C85393rU(userSession, c38321qM, false));
        }
        SpannableStringBuilder A002 = c85383rT.A00();
        C14360o3.A07(A002);
        return A002;
    }

    public static final String A03(Context context, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        List ByK = c38321qM.A0C.ByK();
        if (ByK == null || ByK.isEmpty()) {
            return "";
        }
        InterfaceC87503vI interfaceC87503vI = (InterfaceC87503vI) ByK.get(0);
        Resources resources = context.getResources();
        StringBuilder sb = new StringBuilder();
        if (interfaceC87503vI.ByT().ordinal() == 7) {
            sb.append(resources.getString(2131962739));
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public final SpannableStringBuilder A04(Context context, UserSession userSession, Integer num, List list, final InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2, boolean z3) {
        CharSequence string;
        CharSequence charSequence;
        int i;
        int i2;
        String[] strArr;
        int i3;
        int i4;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(list, 4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AnonymousClass001.A0D((String) it.next(), '@'));
        }
        if (z && num != null) {
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            int intValue = num.intValue();
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    if (intValue == 2) {
                        if (!z2) {
                            i4 = 2131977127;
                        } else {
                            i4 = 2131977128;
                            if (z3) {
                                i4 = 2131977129;
                            }
                        }
                        charSequence = AbstractC07900bA.A01(resources, new String[]{(String) arrayList.get(0), (String) arrayList.get(1)}, i4);
                        spannableStringBuilder.append(charSequence);
                    } else {
                        if (!z2) {
                            i = R.plurals.x_y_and_n_others_voted;
                        } else {
                            i = R.plurals.x_y_and_n_others_voted_on_surfaces;
                            if (z3) {
                                i = R.plurals.x_y_and_n_others_voted_on_surfaces_voted_viewer;
                            }
                        }
                        i2 = intValue - 2;
                        strArr = new String[]{(String) arrayList.get(0), (String) arrayList.get(1), C84963qk.A04(resources, Integer.valueOf(i2), 10000, false, false)};
                        Spanned A02 = AbstractC07900bA.A02(resources, strArr, i, i2);
                        C14360o3.A07(A02);
                        spannableStringBuilder.append((CharSequence) A02);
                        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class);
                        C14360o3.A07(spans);
                        Object A05 = AbstractC009903n.A05(spans);
                        spannableStringBuilder.setSpan(new AbstractC85543rj() { // from class: X.9o9
                            {
                                super("sans-serif-medium", -1, false);
                            }

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                InterfaceC16820sZ.this.invoke();
                            }
                        }, A02.getSpanStart(A05), A02.getSpanEnd(A05), 33);
                    }
                } else if (intValue == 1) {
                    if (!z2) {
                        i3 = 2131977132;
                    } else {
                        i3 = 2131977133;
                        if (z3) {
                            i3 = 2131977134;
                        }
                    }
                    charSequence = AbstractC07900bA.A01(resources, new String[]{(String) arrayList.get(0)}, i3);
                    C14360o3.A07(charSequence);
                    spannableStringBuilder.append(charSequence);
                } else {
                    if (!z2) {
                        i = R.plurals.x_and_n_others_voted;
                    } else {
                        i = R.plurals.x_and_n_others_voted_on_surfaces;
                        if (z3) {
                            i = R.plurals.x_and_n_others_voted_on_surfaces_voted_viewer;
                        }
                    }
                    i2 = intValue - 1;
                    strArr = new String[]{(String) arrayList.get(0), C84963qk.A04(resources, Integer.valueOf(i2), 10000, false, false)};
                    Spanned A022 = AbstractC07900bA.A02(resources, strArr, i, i2);
                    C14360o3.A07(A022);
                    spannableStringBuilder.append((CharSequence) A022);
                    Object[] spans2 = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class);
                    C14360o3.A07(spans2);
                    Object A052 = AbstractC009903n.A05(spans2);
                    spannableStringBuilder.setSpan(new AbstractC85543rj() { // from class: X.9o9
                        {
                            super("sans-serif-medium", -1, false);
                        }

                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            InterfaceC16820sZ.this.invoke();
                        }
                    }, A022.getSpanStart(A052), A022.getSpanEnd(A052), 33);
                }
            }
        } else {
            Resources resources2 = context.getResources();
            C14360o3.A07(resources2);
            int size2 = arrayList.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    int i5 = 2131977127;
                    if (size2 != 2) {
                        i5 = 2131977136;
                    }
                    string = AbstractC07900bA.A01(resources2, new String[]{(String) arrayList.get(0), (String) arrayList.get(1)}, i5);
                } else {
                    string = resources2.getString(2131977132, arrayList.get(0));
                }
                charSequence = string;
                spannableStringBuilder.append(charSequence);
            }
        }
        C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession);
        c85383rT.A0F = "sans-serif-medium";
        c85383rT.A01 = -1;
        c85383rT.A0Q = true;
        c85383rT.A03(new C49400LsY(interfaceC16660sJ));
        SpannableStringBuilder A002 = c85383rT.A00();
        C14360o3.A07(A002);
        return A002;
    }

    public static final SpannableStringBuilder A02(Context context, UserSession userSession, C38321qM c38321qM, List list, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AnonymousClass001.A0D((String) it.next(), '@'));
        }
        int A0w = c38321qM.A0w();
        if (A0w > arrayList.size() && z) {
            C77403dQ c77403dQ = C77403dQ.A00;
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            c77403dQ.A09(resources, spannableStringBuilder, SocialContextType.A0C, arrayList, A0w, 2);
        } else {
            Resources resources2 = context.getResources();
            C14360o3.A07(resources2);
            C77403dQ.A03(resources2, spannableStringBuilder, SocialContextType.A0C, arrayList, i);
        }
        C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession);
        c85383rT.A0F = "sans-serif-medium";
        c85383rT.A01 = -1;
        c85383rT.A0Q = true;
        c85383rT.A02(new C85413rW(userSession, c38321qM, false));
        c85383rT.A03(new C85393rU(userSession, c38321qM, false));
        SpannableStringBuilder A002 = c85383rT.A00();
        C14360o3.A07(A002);
        return A002;
    }

    public static final SpannableStringBuilder A01(Context context, UserSession userSession, C38321qM c38321qM, List list) {
        int i;
        String[] strArr;
        CharSequence charSequence;
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AnonymousClass001.A0D((String) it.next(), '@'));
        }
        int A0w = c38321qM.A0w();
        if (A0w - arrayList.size() > 1) {
            C14360o3.A0A(resources);
            C14360o3.A0B(resources, 0);
            SocialContextType socialContextType = SocialContextType.A0C;
            int size = arrayList.size();
            if (size <= 2) {
                if (size != 1) {
                    if (size != 2) {
                        i = 2131965121;
                        if (socialContextType.ordinal() == 7) {
                            i = 2131962747;
                        }
                        strArr = new String[]{(String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2)};
                    }
                } else {
                    int ordinal = socialContextType.ordinal();
                    if (A0w == 1) {
                        int i2 = 2131965116;
                        if (ordinal == 7) {
                            i2 = 2131962742;
                        }
                        charSequence = resources.getString(i2, arrayList.get(0));
                        spannableStringBuilder.append(charSequence);
                    } else {
                        i = 2131965117;
                        if (ordinal == 7) {
                            i = 2131962743;
                        }
                        strArr = new String[]{(String) arrayList.get(0)};
                    }
                }
                charSequence = AbstractC07900bA.A01(resources, strArr, i);
                spannableStringBuilder.append(charSequence);
            }
            int ordinal2 = socialContextType.ordinal();
            if (A0w == 2) {
                i = 2131965118;
                if (ordinal2 == 7) {
                    i = 2131962744;
                }
            } else {
                i = 2131965119;
                if (ordinal2 == 7) {
                    i = 2131962745;
                }
            }
            strArr = new String[]{(String) arrayList.get(0), (String) arrayList.get(1)};
            charSequence = AbstractC07900bA.A01(resources, strArr, i);
            spannableStringBuilder.append(charSequence);
        } else {
            C14360o3.A0A(resources);
            C14360o3.A0B(resources, 0);
            C77403dQ.A03(resources, spannableStringBuilder, SocialContextType.A0C, arrayList, 3);
        }
        C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession);
        c85383rT.A0F = "sans-serif-medium";
        c85383rT.A01 = -1;
        c85383rT.A0Q = true;
        c85383rT.A02(new C85413rW(userSession, c38321qM, false));
        c85383rT.A03(new C85393rU(userSession, c38321qM, false));
        SpannableStringBuilder A002 = c85383rT.A00();
        C14360o3.A07(A002);
        return A002;
    }
}
