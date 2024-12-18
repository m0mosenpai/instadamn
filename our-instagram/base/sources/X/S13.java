package X;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class S13 {
    public static JSONObject A00(SHV shv, C60548R6l c60548R6l, C60552R6p c60552R6p, C60549R6m c60549R6m, C60550R6n c60550R6n, C60551R6o c60551R6o, C60553R6q c60553R6q, C60554R6r c60554R6r, boolean z, boolean z2) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.putOpt(c60549R6m.A00, c60549R6m.A02(z2));
        if (c60551R6o != null) {
            A0q.putOpt(c60551R6o.A00, c60551R6o.A02(z2));
        }
        if (c60548R6l != null) {
            A0q.putOpt(c60548R6l.A00, c60548R6l.A02(z2));
        }
        if (c60550R6n != null) {
            A0q.putOpt(c60550R6n.A00, c60550R6n.A02(z2));
        }
        if (shv != null) {
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            A0q2.putOpt("ssr", shv.A03);
            A0q2.putOpt("mcd", Long.valueOf(shv.A00));
            A0q2.putOpt("mfcl", Long.valueOf(shv.A02));
            A0q2.putOpt("mcg", Long.valueOf(shv.A01));
            A0q.putOpt("ss", A0q2);
        }
        if (c60552R6p != null) {
            A0q.putOpt(c60552R6p.A03, c60552R6p.A02(z));
        }
        if (c60554R6r != null) {
            A0q.putOpt(c60554R6r.A03, c60554R6r.A02(z));
        }
        if (c60553R6q != null) {
            A0q.putOpt(c60553R6q.A03, c60553R6q.A02(z));
        }
        return A0q;
    }
}
