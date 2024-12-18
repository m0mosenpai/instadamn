package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53236NgZ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53236NgZ[] A02;
    public static final EnumC53236NgZ A03;
    public static final EnumC53236NgZ A04;
    public static final EnumC53236NgZ A05;
    public static final EnumC53236NgZ A06;
    public static final EnumC53236NgZ A07;
    public static final EnumC53236NgZ A08;
    public static final EnumC53236NgZ A09;
    public final CAY A00;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.CAY] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.CAY] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X.CAY] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, X.CAY] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, X.CAY] */
    static {
        EnumC53236NgZ enumC53236NgZ = new EnumC53236NgZ(new Object(), "VIEW_TYPE_COVER", 0);
        A03 = enumC53236NgZ;
        EnumC53236NgZ enumC53236NgZ2 = new EnumC53236NgZ(new Object(), "VIEW_TYPE_VALUE_PROPS", 1);
        A09 = enumC53236NgZ2;
        EnumC53236NgZ enumC53236NgZ3 = new EnumC53236NgZ(new Object(), "VIEW_TYPE_ELIGIBILITY_CRITERIA", 2);
        A04 = enumC53236NgZ3;
        final String str = "insights";
        EnumC53236NgZ enumC53236NgZ4 = new EnumC53236NgZ(new CAY(str) { // from class: X.NLL
            public final String A00;

            @Override // X.CAY
            public final C3OO A00(ViewGroup viewGroup) {
                return new C51296MlJ(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.value_props_hscroll_row, false));
            }

            {
                this.A00 = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
            @Override // X.CAY
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A01(X.C3OO r7, X.InterfaceC11380iw r8, com.instagram.common.session.UserSession r9, java.util.List r10, int r11) {
                /*
                    r6 = this;
                    X.AbstractC167017dG.A1N(r7, r10)
                    r0 = 4
                    X.C14360o3.A0B(r8, r0)
                    X.MlJ r7 = (X.C51296MlJ) r7
                    java.lang.Object r2 = r10.get(r11)
                    java.lang.String r5 = r6.A00
                    r4 = 0
                    X.AbstractC167007dF.A1D(r2, r4, r5)
                    X.0sl r3 = X.C16930sl.A00
                    java.lang.String r0 = "insights"
                    boolean r0 = r5.equals(r0)
                    if (r0 == 0) goto L63
                    android.widget.TextView r1 = r7.A01
                    X.MtV r2 = (X.C51746MtV) r2
                    java.lang.String r0 = r2.A04
                    r1.setText(r0)
                    android.widget.TextView r1 = r7.A00
                    java.lang.String r0 = r2.A02
                    r1.setText(r0)
                    java.lang.Object r3 = r2.A01
                    java.util.List r3 = (java.util.List) r3
                    java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creatortools.api.schemas.ThemedImageURL>"
                L33:
                    X.C14360o3.A0C(r3, r0)
                L36:
                    boolean r0 = r3.isEmpty()
                    if (r0 == 0) goto L44
                    androidx.recyclerview.widget.RecyclerView r1 = r7.A02
                    r0 = 8
                    r1.setVisibility(r0)
                L43:
                    return
                L44:
                    X.MiZ r2 = new X.MiZ
                    r2.<init>(r5, r8)
                    androidx.recyclerview.widget.RecyclerView r1 = r7.A02
                    r1.setAdapter(r2)
                    android.content.Context r0 = r1.getContext()
                    X.AbstractC31174DnI.A17(r0, r1, r4)
                    java.util.List r0 = r2.A00
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L43
                    r2.A00 = r3
                    r2.notifyDataSetChanged()
                    return
                L63:
                    java.lang.String r0 = "monetization"
                    boolean r0 = r5.equals(r0)
                    if (r0 == 0) goto L36
                    android.widget.TextView r1 = r7.A01
                    X.MtV r2 = (X.C51746MtV) r2
                    java.lang.String r0 = r2.A04
                    r1.setText(r0)
                    android.widget.TextView r1 = r7.A00
                    java.lang.String r0 = r2.A02
                    r1.setText(r0)
                    java.lang.Object r3 = r2.A01
                    java.util.List r3 = (java.util.List) r3
                    java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creatortools.api.schemas.ImageInfo>"
                    goto L33
                */
                throw new UnsupportedOperationException("Method not decompiled: X.NLL.A01(X.3OO, X.0iw, com.instagram.common.session.UserSession, java.util.List, int):void");
            }
        }, "VIEW_TYPE_INSIGHTS_HSCROLL", 3);
        A06 = enumC53236NgZ4;
        final String str2 = "monetization";
        EnumC53236NgZ enumC53236NgZ5 = new EnumC53236NgZ(new CAY(str2) { // from class: X.NLL
            public final String A00;

            @Override // X.CAY
            public final C3OO A00(ViewGroup viewGroup) {
                return new C51296MlJ(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.value_props_hscroll_row, false));
            }

            {
                this.A00 = str2;
            }

            @Override // X.CAY
            public final void A01(C3OO c3oo, InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list, int i) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    this = this;
                    X.AbstractC167017dG.A1N(r7, r10)
                    r0 = 4
                    X.C14360o3.A0B(r8, r0)
                    X.MlJ r7 = (X.C51296MlJ) r7
                    java.lang.Object r2 = r10.get(r11)
                    java.lang.String r5 = r6.A00
                    r4 = 0
                    X.AbstractC167007dF.A1D(r2, r4, r5)
                    X.0sl r3 = X.C16930sl.A00
                    java.lang.String r0 = "insights"
                    boolean r0 = r5.equals(r0)
                    if (r0 == 0) goto L63
                    android.widget.TextView r1 = r7.A01
                    X.MtV r2 = (X.C51746MtV) r2
                    java.lang.String r0 = r2.A04
                    r1.setText(r0)
                    android.widget.TextView r1 = r7.A00
                    java.lang.String r0 = r2.A02
                    r1.setText(r0)
                    java.lang.Object r3 = r2.A01
                    java.util.List r3 = (java.util.List) r3
                    java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creatortools.api.schemas.ThemedImageURL>"
                L33:
                    X.C14360o3.A0C(r3, r0)
                L36:
                    boolean r0 = r3.isEmpty()
                    if (r0 == 0) goto L44
                    androidx.recyclerview.widget.RecyclerView r1 = r7.A02
                    r0 = 8
                    r1.setVisibility(r0)
                L43:
                    return
                L44:
                    X.MiZ r2 = new X.MiZ
                    r2.<init>(r5, r8)
                    androidx.recyclerview.widget.RecyclerView r1 = r7.A02
                    r1.setAdapter(r2)
                    android.content.Context r0 = r1.getContext()
                    X.AbstractC31174DnI.A17(r0, r1, r4)
                    java.util.List r0 = r2.A00
                    boolean r0 = r3.equals(r0)
                    if (r0 != 0) goto L43
                    r2.A00 = r3
                    r2.notifyDataSetChanged()
                    return
                L63:
                    java.lang.String r0 = "monetization"
                    boolean r0 = r5.equals(r0)
                    if (r0 == 0) goto L36
                    android.widget.TextView r1 = r7.A01
                    X.MtV r2 = (X.C51746MtV) r2
                    java.lang.String r0 = r2.A04
                    r1.setText(r0)
                    android.widget.TextView r1 = r7.A00
                    java.lang.String r0 = r2.A02
                    r1.setText(r0)
                    java.lang.Object r3 = r2.A01
                    java.util.List r3 = (java.util.List) r3
                    java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.creatortools.api.schemas.ImageInfo>"
                    goto L33
                */
                throw new UnsupportedOperationException("Method not decompiled: X.NLL.A01(X.3OO, X.0iw, com.instagram.common.session.UserSession, java.util.List, int):void");
            }
        }, "VIEW_TYPE_MONETIZATION_HSCROLL", 4);
        A08 = enumC53236NgZ5;
        EnumC53236NgZ enumC53236NgZ6 = new EnumC53236NgZ(new Object(), "VIEW_TYPE_INSPIRATION", 5);
        A07 = enumC53236NgZ6;
        EnumC53236NgZ enumC53236NgZ7 = new EnumC53236NgZ(new Object(), "VIEW_TYPE_ERROR_ROW", 6);
        A05 = enumC53236NgZ7;
        EnumC53236NgZ[] enumC53236NgZArr = {enumC53236NgZ, enumC53236NgZ2, enumC53236NgZ3, enumC53236NgZ4, enumC53236NgZ5, enumC53236NgZ6, enumC53236NgZ7};
        A02 = enumC53236NgZArr;
        A01 = AbstractC12190kN.A00(enumC53236NgZArr);
    }

    public static EnumC53236NgZ valueOf(String str) {
        return (EnumC53236NgZ) Enum.valueOf(EnumC53236NgZ.class, str);
    }

    public static EnumC53236NgZ[] values() {
        return (EnumC53236NgZ[]) A02.clone();
    }

    public EnumC53236NgZ(CAY cay, String str, int i) {
        this.A00 = cay;
    }
}
