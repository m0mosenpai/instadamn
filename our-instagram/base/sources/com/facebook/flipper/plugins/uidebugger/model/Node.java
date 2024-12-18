package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C192398fh;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import X.C3SG;
import X.X01;
import X.X0F;
import X.X6R;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes11.dex */
public final class Node {
    public static final C3R9[] A0D;
    public static final Companion Companion = new Object();
    public final int A00;
    public final Bounds A01;
    public final BoxData A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final Map A09;
    public final Map A0A;
    public final Set A0B;
    public final JsonObject A0C;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X0F.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.flipper.plugins.uidebugger.model.Node$Companion, java.lang.Object] */
    static {
        C192398fh c192398fh = C192398fh.A00;
        C3RL c3rl = new C3RL(c192398fh, X01.A00);
        C3RD c3rd = C3RD.A01;
        A0D = new C3R9[]{null, null, null, null, null, c3rl, new C3RL(c3rd, c3rd), null, null, new X6R(c3rd), new C3SG(c192398fh), null, null};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Node) {
                Node node = (Node) obj;
                if (this.A00 != node.A00 || !C14360o3.A0K(this.A05, node.A05) || !C14360o3.A0K(this.A07, node.A07) || !C14360o3.A0K(this.A06, node.A06) || !C14360o3.A0K(this.A02, node.A02) || !C14360o3.A0K(this.A09, node.A09) || !C14360o3.A0K(this.A0A, node.A0A) || !C14360o3.A0K(this.A0C, node.A0C) || !C14360o3.A0K(this.A01, node.A01) || !C14360o3.A0K(this.A0B, node.A0B) || !C14360o3.A0K(this.A08, node.A08) || !C14360o3.A0K(this.A04, node.A04) || !C14360o3.A0K(this.A03, node.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Node(Bounds bounds, BoxData boxData, Boolean bool, Integer num, Integer num2, String str, String str2, List list, Map map, Map map2, Set set, JsonObject jsonObject, int i, int i2) {
        if (8191 != (i & 8191)) {
            AbstractC68612VXn.A00(X0F.A01, i, 8191);
            throw C00O.createAndThrow();
        }
        this.A00 = i2;
        this.A05 = num;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = boxData;
        this.A09 = map;
        this.A0A = map2;
        this.A0C = jsonObject;
        this.A01 = bounds;
        this.A0B = set;
        this.A08 = list;
        this.A04 = num2;
        this.A03 = bool;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A09, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A07, ((this.A00 * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC167017dG.A0M(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A0C)) * 31))) + AbstractC167017dG.A0M(this.A04)) * 31;
        Boolean bool = this.A03;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0J + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node(id=");
        sb.append(this.A00);
        sb.append(", parent=");
        sb.append(this.A05);
        sb.append(", qualifiedName=");
        sb.append(this.A07);
        sb.append(", name=");
        sb.append(this.A06);
        sb.append(", boxData=");
        sb.append(this.A02);
        sb.append(AbstractC43591JPw.A00(505));
        sb.append(this.A09);
        sb.append(", inlineAttributes=");
        sb.append(this.A0A);
        sb.append(", hiddenAttributes=");
        sb.append(this.A0C);
        sb.append(", bounds=");
        sb.append(this.A01);
        sb.append(AbstractC58317Pt9.A00(155));
        sb.append(this.A0B);
        sb.append(AbstractC111324zv.A00(561));
        sb.append(this.A08);
        sb.append(", activeChild=");
        sb.append(this.A04);
        sb.append(", additionalDataCollection=");
        return AbstractC167017dG.A0o(this.A03, sb);
    }
}
