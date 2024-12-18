package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.9rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC222499rq {
    public static final EnumC222499rq A00;
    public static final EnumC222499rq A01;
    public static final EnumC222499rq A02;
    public static final EnumC222499rq A03;
    public static final EnumC222499rq A04;

    static {
        final int i = 0;
        A02 = new EnumC222499rq(i) { // from class: X.9eQ
            public final int A00;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r2 = this;
                    r2.A00 = r3
                    switch(r3) {
                        case 0: goto Lc;
                        case 1: goto L10;
                        case 2: goto L14;
                        case 3: goto L18;
                        default: goto L5;
                    }
                L5:
                    java.lang.String r1 = "SIZE"
                    r0 = 4
                L8:
                    r2.<init>(r1, r0)
                    return
                Lc:
                    java.lang.String r1 = "EXPLICIT"
                    r0 = 0
                    goto L8
                L10:
                    java.lang.String r1 = "REPLACED"
                    r0 = 1
                    goto L8
                L14:
                    java.lang.String r1 = "COLLECTED"
                    r0 = 2
                    goto L8
                L18:
                    java.lang.String r1 = "EXPIRED"
                    r0 = 3
                    goto L8
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C214269eQ.<init>(int):void");
            }
        };
        final int i2 = 1;
        A03 = new EnumC222499rq
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: SPUT 
              (wrap:X.9rq:0x000b: CONSTRUCTOR (r1v1 'i2' int A[DONT_INLINE]) A[MD:(int):void (m), WRAPPED] (LINE:11) call: X.9eQ.<init>(int):void type: CONSTRUCTOR)
             (LINE:14) X.9rq.A03 X.9rq in method: X.9rq.<clinit>():void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:810)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:498)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            r1 = 0
            X.9eQ r0 = new X.9eQ
            r0.<init>(r1)
            X.EnumC222499rq.A02 = r0
            r1 = 1
            X.9eQ r0 = new X.9eQ
            r0.<init>(r1)
            X.EnumC222499rq.A03 = r0
            r1 = 2
            X.9eQ r0 = new X.9eQ
            r0.<init>(r1)
            X.EnumC222499rq.A00 = r0
            r1 = 3
            X.9eQ r0 = new X.9eQ
            r0.<init>(r1)
            X.EnumC222499rq.A01 = r0
            r1 = 4
            X.9eQ r0 = new X.9eQ
            r0.<init>(r1)
            X.EnumC222499rq.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC222499rq.<clinit>():void");
    }

    public EnumC222499rq(String $enum$name, int $enum$ordinal) {
    }
}
