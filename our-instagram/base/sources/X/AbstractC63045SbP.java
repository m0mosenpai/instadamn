package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SbP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63045SbP {
    public static final AutofillData A00(C62620SJd c62620SJd, C43031yW c43031yW) {
        C45126Jxv c45126Jxv;
        Object obj;
        C14360o3.A0B(c62620SJd, 0);
        String A04 = C18U.A04(C06090Tz.A06, c43031yW.A00, 36885750375187126L);
        C14360o3.A0A(A04);
        C45126Jxv c45126Jxv2 = null;
        if (C14360o3.A0K(A04, "recent")) {
            c45126Jxv = null;
            c45126Jxv2 = (C45126Jxv) c62620SJd.A0N.A02;
        } else if (C14360o3.A0K(A04, "recent_crossapp")) {
            C51760Mtj c51760Mtj = c62620SJd.A0N;
            c45126Jxv2 = (C45126Jxv) c51760Mtj.A02;
            c45126Jxv = (C45126Jxv) c51760Mtj.A00;
        } else {
            c45126Jxv = null;
        }
        Map A01 = AbstractC62772SQo.A01(c45126Jxv2);
        Map A012 = AbstractC62772SQo.A01(c45126Jxv);
        LinkedHashMap A03 = AbstractC06930Yk.A03(AbstractC62772SQo.A01((C45126Jxv) AbstractC001800i.A0O((List) c62620SJd.A0C.A00, 0)));
        java.util.Set set = c62620SJd.A00.A07;
        if (set != null) {
            for (Object obj2 : set) {
                CharSequence charSequence = (CharSequence) A03.get(obj2);
                if (charSequence == null || charSequence.length() == 0) {
                    CharSequence charSequence2 = (CharSequence) A01.get(obj2);
                    if (charSequence2 != null && charSequence2.length() != 0) {
                        obj = A01.get(obj2);
                    } else {
                        obj = A012.get(obj2);
                    }
                    A03.put(obj2, obj);
                }
            }
        }
        return new AutofillData(A03);
    }

    public static final Map A02(C62620SJd c62620SJd, C43031yW c43031yW) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AbstractC167007dF.A1K(c62620SJd, c43031yW);
        C51760Mtj c51760Mtj = c62620SJd.A0N;
        if (c51760Mtj.A00 != null || c51760Mtj.A02 != null) {
            boolean z = false;
            String A04 = C18U.A04(C06090Tz.A06, c43031yW.A00, 36885750375187126L);
            C14360o3.A0A(A04);
            if (!C14360o3.A0K(A04, "control")) {
                Map A01 = AbstractC62772SQo.A01((C45126Jxv) c51760Mtj.A02);
                Map A012 = AbstractC62772SQo.A01((C45126Jxv) c51760Mtj.A00);
                Map A013 = AbstractC62772SQo.A01((C45126Jxv) AbstractC001800i.A0O((List) c62620SJd.A0C.A00, 0));
                Map A12 = AbstractC58318PtA.A12(A00(c62620SJd, c43031yW).A00);
                LinkedHashSet A0l = AbstractC31171DnF.A0l();
                LinkedHashSet A0l2 = AbstractC31171DnF.A0l();
                java.util.Set set = c62620SJd.A00.A07;
                if (set != null) {
                    for (Object obj : set) {
                        CharSequence charSequence3 = (CharSequence) A013.get(obj);
                        if (charSequence3 == null || charSequence3.length() == 0) {
                            CharSequence charSequence4 = (CharSequence) A12.get(obj);
                            if (charSequence4 != null && charSequence4.length() != 0 && (charSequence2 = (CharSequence) A01.get(obj)) != null && charSequence2.length() != 0) {
                                A0l.add(obj);
                            } else {
                                CharSequence charSequence5 = (CharSequence) A12.get(obj);
                                if (charSequence5 != null && charSequence5.length() != 0 && (charSequence = (CharSequence) A012.get(obj)) != null && charSequence.length() != 0) {
                                    A0l2.add(obj);
                                }
                            }
                            z = true;
                        }
                    }
                }
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                if (z) {
                    A1I.put("supplemented_wallet_data_from_recent", AbstractC61723Rse.A00(A0l));
                    A1I.put("supplemented_wallet_data_from_crossapp", AbstractC61723Rse.A00(A0l2));
                    return A1I;
                }
                return A1I;
            }
        }
        return AbstractC06930Yk.A0E();
    }

    public static final C45126Jxv A01(SKK skk, String str) {
        Map A0E;
        if (str != null && str.length() != 0) {
            try {
                JSONObject A17 = AbstractC58318PtA.A17(str);
                Iterator<String> keys = A17.keys();
                C14360o3.A07(keys);
                C2Z2 A0A = AbstractC224717j.A0A(keys);
                A0E = AbstractC166987dD.A1I();
                Iterator it = A0A.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    A0E.put(next, A17.optString((String) next));
                }
            } catch (JSONException unused) {
                skk.A00("Wrong JSON format stored for parsing contact data");
                A0E = AbstractC06930Yk.A0E();
            }
            return AbstractC62772SQo.A00(A0E);
        }
        return null;
    }
}
