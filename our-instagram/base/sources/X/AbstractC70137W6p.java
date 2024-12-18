package X;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.W6p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70137W6p {
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d36, code lost:
    
        if (r2 == null) goto L489;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object, com.instagram.common.gallery.FaceCenter] */
    /* JADX WARN: Type inference failed for: r0v169, types: [java.util.List, boolean, java.lang.Boolean, java.lang.String, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v184 */
    /* JADX WARN: Type inference failed for: r0v185 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v187 */
    /* JADX WARN: Type inference failed for: r0v188 */
    /* JADX WARN: Type inference failed for: r0v189 */
    /* JADX WARN: Type inference failed for: r0v190 */
    /* JADX WARN: Type inference failed for: r0v191 */
    /* JADX WARN: Type inference failed for: r0v192 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean, int, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.US9] */
    /* JADX WARN: Type inference failed for: r10v18, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, X.74d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, X.AlD] */
    /* JADX WARN: Type inference failed for: r2v14, types: [X.6RN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.instagram.music.common.model.WordOffset, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, X.9kJ] */
    /* JADX WARN: Type inference failed for: r2v51, types: [X.Wm2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [X.9kG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v66, types: [X.5QK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Object, X.9kH] */
    /* JADX WARN: Type inference failed for: r2v76, types: [X.9kD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v241 */
    /* JADX WARN: Type inference failed for: r3v242 */
    /* JADX WARN: Type inference failed for: r3v243 */
    /* JADX WARN: Type inference failed for: r3v244 */
    /* JADX WARN: Type inference failed for: r3v245 */
    /* JADX WARN: Type inference failed for: r3v246 */
    /* JADX WARN: Type inference failed for: r3v247 */
    /* JADX WARN: Type inference failed for: r3v248 */
    /* JADX WARN: Type inference failed for: r3v249 */
    /* JADX WARN: Type inference failed for: r3v250 */
    /* JADX WARN: Type inference failed for: r3v251 */
    /* JADX WARN: Type inference failed for: r3v252 */
    /* JADX WARN: Type inference failed for: r3v253 */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Long, java.lang.String, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v65, types: [X.Gom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87, types: [float, X.8jr, int] */
    /* JADX WARN: Type inference failed for: r4v46, types: [X.5QO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C5NM A00(X.XLW r45) {
        /*
            Method dump skipped, instructions count: 3790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70137W6p.A00(X.XLW):X.5NM");
    }

    public static final List A02(C198928qs c198928qs) {
        List<BD4> list;
        C14360o3.A0B(c198928qs, 0);
        Map map = c198928qs.A05;
        if (map != null && (list = c198928qs.A04) != null) {
            ArrayList arrayList = new ArrayList();
            for (BD4 bd4 : list) {
                Drawable drawable = ((C9LJ) bd4).A0B;
                C202278x7 c202278x7 = (C202278x7) map.get(drawable);
                C5NL A00 = AbstractC226649zM.A00(drawable);
                C8FC c8fc = null;
                if (A00 != null) {
                    Object C4x = bd4.C4x();
                    if (C4x instanceof C8FC) {
                        c8fc = (C8FC) C4x;
                    }
                    XLW A01 = A01(A00, c8fc, c202278x7);
                    if (A01 != null) {
                        arrayList.add(A01);
                    }
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v6 ??, still in use, count: 3, list:
          (r8v6 ?? I:X.BgG) from 0x1094: IPUT (r5v37 ?? I:java.lang.Object), (r8v6 ?? I:X.BgG) (LINE:4265198) X.BgG.A01 java.lang.Object
          (r8v6 ?? I:X.BgG) from 0x1098: IPUT (r5v38 ?? I:java.lang.String), (r8v6 ?? I:X.BgG) (LINE:4265200) X.BgG.A03 java.lang.String
          (r8v6 ?? I:X.BgG) from 0x109c: IPUT (r5v39 ?? I:java.lang.Object), (r8v6 ?? I:X.BgG) (LINE:4265202) X.BgG.A02 java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final X.XLW A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v6 ??, still in use, count: 3, list:
          (r8v6 ?? I:X.BgG) from 0x1094: IPUT (r5v37 ?? I:java.lang.Object), (r8v6 ?? I:X.BgG) (LINE:4265198) X.BgG.A01 java.lang.Object
          (r8v6 ?? I:X.BgG) from 0x1098: IPUT (r5v38 ?? I:java.lang.String), (r8v6 ?? I:X.BgG) (LINE:4265200) X.BgG.A03 java.lang.String
          (r8v6 ?? I:X.BgG) from 0x109c: IPUT (r5v39 ?? I:java.lang.Object), (r8v6 ?? I:X.BgG) (LINE:4265202) X.BgG.A02 java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r43v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
}
