package com.facebook.flipper.plugins.uidebugger.model;

import X.AbstractC06960Yn;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC68219VIb;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0YZ;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C71730Wzv;
import X.X7Q;
import X.X7R;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class CustomActionGroup {
    public static final C3R9[] A03;
    public static final Companion Companion = new Object();
    public final X7R A00;
    public final String A01;
    public final List A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71730Wzv.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.flipper.plugins.uidebugger.model.CustomActionGroup$Companion, java.lang.Object] */
    static {
        PolymorphicSerializer polymorphicSerializer = new PolymorphicSerializer(new C0YZ(X7R.class));
        polymorphicSerializer.A00 = AbstractC06960Yn.A0S(new Annotation[0]);
        PolymorphicSerializer polymorphicSerializer2 = new PolymorphicSerializer(new C0YZ(X7Q.class));
        polymorphicSerializer2.A00 = AbstractC06960Yn.A0S(new Annotation[0]);
        A03 = new C3R9[]{null, polymorphicSerializer, new C3SG(polymorphicSerializer2)};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomActionGroup) {
                CustomActionGroup customActionGroup = (CustomActionGroup) obj;
                if (!C14360o3.A0K(this.A01, customActionGroup.A01) || !C14360o3.A0K(this.A00, customActionGroup.A00) || !C14360o3.A0K(this.A02, customActionGroup.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CustomActionGroup(X7R x7r, String str, List list, int i) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71730Wzv.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A00 = x7r;
        this.A02 = list;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, this.A01.hashCode() * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomActionGroup(title=");
        sb.append(this.A01);
        sb.append(", actionIcon=");
        sb.append(this.A00);
        sb.append(AbstractC43591JPw.A00(23));
        return AbstractC167017dG.A0o(this.A02, sb);
    }
}
