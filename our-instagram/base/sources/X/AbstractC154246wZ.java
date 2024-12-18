package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6wZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154246wZ {
    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, UserSession userSession, final InterfaceC154236wY interfaceC154236wY, List list) {
        StringBuilder sb;
        String name;
        C14360o3.A0B(userSession, 1);
        if (list != null && !list.isEmpty()) {
            final HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC81933lD interfaceC81933lD = (InterfaceC81933lD) it.next();
                if (AbstractC154636xD.A00(interfaceC81933lD) == C05F.A00) {
                    sb = new StringBuilder();
                    sb.append('@');
                    InterfaceC81913lB CDh = interfaceC81933lD.CDh();
                    CDh.getClass();
                    name = CDh.getUsername();
                } else {
                    sb = new StringBuilder();
                    sb.append('#');
                    Hashtag BD4 = interfaceC81933lD.BD4();
                    BD4.getClass();
                    name = BD4.getName();
                }
                sb.append(name);
                hashMap.put(sb.toString(), interfaceC81933lD);
            }
            String obj = spannableStringBuilder.toString();
            C14360o3.A07(obj);
            C115955Ml c115955Ml = new C115955Ml(502, A00(obj, AbstractC85433rY.A03(obj), hashMap), A00(obj, AbstractC85433rY.A05(obj, false), hashMap), null);
            int A0F = AbstractC53242c7.A0F(context, R.attr.igds_color_link);
            C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession, c115955Ml);
            c85383rT.A0M = false;
            c85383rT.A03 = A0F;
            c85383rT.A0L = false;
            c85383rT.A01 = A0F;
            c85383rT.A03(new InterfaceC85403rV() { // from class: X.6xE
                @Override // X.InterfaceC85403rV
                public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession2, String str) {
                    C14360o3.A0B(str, 1);
                    InterfaceC154236wY interfaceC154236wY2 = InterfaceC154236wY.this;
                    if (interfaceC154236wY2 != null) {
                        String A0D = AnonymousClass001.A0D(str, '@');
                        Locale locale = Locale.getDefault();
                        C14360o3.A07(locale);
                        String lowerCase = A0D.toLowerCase(locale);
                        C14360o3.A07(lowerCase);
                        InterfaceC81933lD interfaceC81933lD2 = (InterfaceC81933lD) hashMap.get(lowerCase);
                        if (interfaceC81933lD2 != null) {
                            interfaceC154236wY2.DE0(interfaceC81933lD2);
                        }
                    }
                }
            });
            c85383rT.A02(new InterfaceC85423rX() { // from class: X.6xF
                @Override // X.InterfaceC85423rX
                public final void D40(ClickableSpan clickableSpan, View view, String str) {
                    C14360o3.A0B(str, 0);
                    InterfaceC154236wY interfaceC154236wY2 = InterfaceC154236wY.this;
                    if (interfaceC154236wY2 != null) {
                        String A0D = AnonymousClass001.A0D(str, '#');
                        Locale locale = Locale.getDefault();
                        C14360o3.A07(locale);
                        String lowerCase = A0D.toLowerCase(locale);
                        C14360o3.A07(lowerCase);
                        InterfaceC81933lD interfaceC81933lD2 = (InterfaceC81933lD) hashMap.get(lowerCase);
                        if (interfaceC81933lD2 != null) {
                            interfaceC154236wY2.DE0(interfaceC81933lD2);
                        }
                    }
                }
            });
            c85383rT.A00();
        }
    }

    public static final ArrayList A00(String str, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C89393yf c89393yf = (C89393yf) it.next();
            String substring = str.substring(c89393yf.A01, c89393yf.A00);
            C14360o3.A07(substring);
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            String lowerCase = substring.toLowerCase(locale);
            C14360o3.A07(lowerCase);
            if (map.containsKey(lowerCase)) {
                arrayList.add(c89393yf);
            }
        }
        return arrayList;
    }
}
