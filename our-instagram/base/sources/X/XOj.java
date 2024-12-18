package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public abstract class XOj {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XOj[] A03;
    public static final XOj A04;
    public static final XOj A05;
    public static final XOj A06;
    public static final XOj A07;
    public static final XOj A08;
    public static final XOj A09;
    public final String A00;

    static {
        XOj xOj = new XOj() { // from class: X.XOk
        };
        A05 = xOj;
        XOj xOj2 = new XOj() { // from class: X.XOl
        };
        A06 = xOj2;
        XOj xOj3 = new XOj() { // from class: X.XOm
        };
        A04 = xOj3;
        XOj xOj4 = new XOj() { // from class: X.XOn
        };
        A08 = xOj4;
        XOj xOj5 = new XOj() { // from class: X.XOo
        };
        A07 = xOj5;
        XOj xOj6 = new XOj() { // from class: X.XOp
        };
        A09 = xOj6;
        XOj[] xOjArr = {xOj, xOj2, xOj3, xOj4, xOj5, xOj6};
        A03 = xOjArr;
        A02 = AbstractC12190kN.A00(xOjArr);
        XOj[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XOj xOj7 : values) {
            A18.put(xOj7.A00, xOj7);
        }
        A01 = A18;
    }

    public static XOj[] values() {
        return (XOj[]) A03.clone();
    }

    public XOj(String str, int i, String str2) {
        this.A00 = str2;
    }
}
