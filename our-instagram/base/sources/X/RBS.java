package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RBS extends SZY {
    public final C45F A00;
    public final C910844k A01;
    public final boolean A02;

    public static Map A00(AbstractC910944l abstractC910944l, RBS rbs, AnonymousClass456 anonymousClass456) {
        Map map = null;
        AbstractC910944l A05 = abstractC910944l.A05();
        if (A05 != null) {
            Class cls = abstractC910944l.A00;
            map = A00(A05, rbs, new C64177T2g(A05.A0G(), rbs.A01));
            for (Field field : cls.getDeclaredFields()) {
                if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                    if (map == null) {
                        map = AbstractC166987dD.A1I();
                    }
                    SG9 sg9 = new SG9(anonymousClass456, field);
                    if (rbs.A02) {
                        AnonymousClass458 anonymousClass458 = sg9.A00;
                        for (Annotation annotation : field.getDeclaredAnnotations()) {
                            anonymousClass458 = anonymousClass458.A00(annotation);
                            if (((SZY) rbs).A00.A0n(annotation)) {
                                anonymousClass458 = rbs.A02(anonymousClass458, annotation);
                            }
                        }
                        sg9.A00 = anonymousClass458;
                    }
                    map.put(field.getName(), sg9);
                }
            }
        }
        return map;
    }

    public RBS(C44W c44w, C45F c45f, C910844k c910844k, boolean z) {
        super(c44w);
        this.A01 = c910844k;
        this.A00 = c44w == null ? null : c45f;
        this.A02 = z;
    }
}
