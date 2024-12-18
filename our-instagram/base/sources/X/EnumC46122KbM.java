package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.KbM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class EnumC46122KbM {
    public static final EnumC46122KbM A00;
    public static final EnumC46122KbM A01;
    public static final EnumC46122KbM A02;
    public static final EnumC46122KbM A03;

    static {
        final int i = 0;
        A00 = new EnumC46122KbM(i) { // from class: X.Xaz
            public final int A00;

            @Override // X.EnumC46122KbM
            public final Object A00(YPv yPv, Object obj) {
                switch (this.A00) {
                    case 0:
                        return yPv.AEc(null);
                    case 1:
                        return yPv.AEy(null);
                    case 2:
                        return yPv.AEw(null);
                    case 3:
                        return yPv.AEu(null);
                    case 4:
                        return yPv.AEx(null);
                    case 5:
                        return yPv.AEv(null);
                    default:
                        return yPv.AEb(null);
                }
            }

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
                        case 4: goto L1c;
                        case 5: goto L20;
                        default: goto L5;
                    }
                L5:
                    java.lang.String r1 = "WITH_CUSTOM_VIEW"
                    r0 = 6
                L8:
                    r2.<init>(r1, r0)
                    return
                Lc:
                    java.lang.String r1 = "DEFAULT"
                    r0 = 0
                    goto L8
                L10:
                    java.lang.String r1 = "WITH_TITLE_AND_SUB_TEXT"
                    r0 = 1
                    goto L8
                L14:
                    java.lang.String r1 = "WITH_IMAGE_ON_RIGHT"
                    r0 = 2
                    goto L8
                L18:
                    java.lang.String r1 = "WITH_CIRCULAR_IMAGE_LEFT"
                    r0 = 3
                    goto L8
                L1c:
                    java.lang.String r1 = "WITH_SQUARE_IMAGE_LEFT"
                    r0 = 4
                    goto L8
                L20:
                    java.lang.String r1 = "WITH_IMAGE_ON_BOTH_SIDES"
                    r0 = 5
                    goto L8
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C72302Xaz.<init>(int):void");
            }
        };
        final int i2 = 1;
        new EnumC46122KbM
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR (r1v1 'i2' int A[DONT_INLINE]) A[MD:(int):void (m)] (LINE:11) call: X.Xaz.<init>(int):void type: CONSTRUCTOR in method: X.KbM.<clinit>():void, file: classes8.dex
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
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            r1 = 0
            X.Xaz r0 = new X.Xaz
            r0.<init>(r1)
            X.EnumC46122KbM.A00 = r0
            r1 = 1
            X.Xaz r0 = new X.Xaz
            r0.<init>(r1)
            r1 = 2
            X.Xaz r0 = new X.Xaz
            r0.<init>(r1)
            r1 = 3
            X.Xaz r0 = new X.Xaz
            r0.<init>(r1)
            X.EnumC46122KbM.A01 = r0
            r1 = 4
            X.Xaz r0 = new X.Xaz
            r0.<init>(r1)
            X.EnumC46122KbM.A03 = r0
            r1 = 5
            X.Xaz r0 = new X.Xaz
            r0.<init>(r1)
            r1 = 6
            X.Xaz r0 = new X.Xaz
            r0.<init>(r1)
            X.EnumC46122KbM.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC46122KbM.<clinit>():void");
    }

    public abstract Object A00(YPv yPv, Object obj);

    public EnumC46122KbM(String str, int i) {
    }
}
