package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A02' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.RfA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class EnumC61096RfA {
    public static final /* synthetic */ EnumC61096RfA[] A00;
    public static final EnumC61096RfA A01;
    public static final EnumC61096RfA A02;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61096RfA EF19;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61096RfA EF18;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61096RfA EF17;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61096RfA EF16;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61096RfA EF15;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61096RfA EF14;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61096RfA EF13;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61096RfA EF12;

    static {
        EnumC61166RgS[] enumC61166RgSArr = EnumC61166RgS.A01;
        final int i = 0;
        EnumC61096RfA enumC61096RfA = new EnumC61096RfA("DOUBLE", 0);
        EnumC61096RfA enumC61096RfA2 = new EnumC61096RfA("FLOAT", 1);
        final int i2 = 2;
        EnumC61096RfA enumC61096RfA3 = new EnumC61096RfA("INT64", 2);
        final int i3 = 3;
        EnumC61096RfA enumC61096RfA4 = new EnumC61096RfA("UINT64", 3);
        EnumC61096RfA enumC61096RfA5 = new EnumC61096RfA("INT32", 4);
        EnumC61096RfA enumC61096RfA6 = new EnumC61096RfA("FIXED64", 5);
        EnumC61096RfA enumC61096RfA7 = new EnumC61096RfA("FIXED32", 6);
        EnumC61096RfA enumC61096RfA8 = new EnumC61096RfA("BOOL", 7);
        EnumC61096RfA enumC61096RfA9 = new EnumC61096RfA(i) { // from class: X.RaK
            public final int A00;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r2 = this;
                    r2.A00 = r3
                    switch(r3) {
                        case 0: goto Ld;
                        case 1: goto L12;
                        case 2: goto L17;
                        default: goto L5;
                    }
                L5:
                    java.lang.String r1 = "BYTES"
                    r0 = 11
                L9:
                    r2.<init>(r1, r0)
                    return
                Ld:
                    java.lang.String r1 = "STRING"
                    r0 = 8
                    goto L9
                L12:
                    java.lang.String r1 = "GROUP"
                    r0 = 9
                    goto L9
                L17:
                    java.lang.String r1 = "MESSAGE"
                    r0 = 10
                    goto L9
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RaK.<init>(int):void");
            }
        };
        A02 = enumC61096RfA9;
        final int i4 = 1;
        EnumC61096RfA raK = new EnumC61096RfA
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: CONSTRUCTOR (r10v0 'raK' X.RfA) = (r0v9 'i4' int A[DONT_INLINE]) A[DECLARE_VAR, MD:(int):void (m)] (LINE:84) call: X.RaK.<init>(int):void type: CONSTRUCTOR in method: X.RfA.<clinit>():void, file: classes10.dex
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
            X.RgS[] r0 = X.EnumC61166RgS.A01
            java.lang.String r1 = "DOUBLE"
            r4 = 0
            r2 = 1
            X.RfA r19 = new X.RfA
            r0 = r19
            r0.<init>(r1, r4)
            java.lang.String r1 = "FLOAT"
            r5 = 5
            X.RfA r18 = new X.RfA
            r0 = r18
            r0.<init>(r1, r2)
            java.lang.String r1 = "INT64"
            r3 = 2
            X.RfA r17 = new X.RfA
            r0 = r17
            r0.<init>(r1, r3)
            java.lang.String r1 = "UINT64"
            r2 = 3
            X.RfA r16 = new X.RfA
            r0 = r16
            r0.<init>(r1, r2)
            java.lang.String r1 = "INT32"
            r0 = 4
            X.RfA r15 = new X.RfA
            r15.<init>(r1, r0)
            java.lang.String r0 = "FIXED64"
            X.RfA r14 = new X.RfA
            r14.<init>(r0, r5)
            java.lang.String r1 = "FIXED32"
            r0 = 6
            X.RfA r13 = new X.RfA
            r13.<init>(r1, r0)
            java.lang.String r1 = "BOOL"
            r0 = 7
            X.RfA r12 = new X.RfA
            r12.<init>(r1, r0)
            X.RaK r11 = new X.RaK
            r11.<init>(r4)
            X.EnumC61096RfA.A02 = r11
            r0 = 1
            X.RaK r10 = new X.RaK
            r10.<init>(r0)
            X.RaK r9 = new X.RaK
            r9.<init>(r3)
            X.EnumC61096RfA.A01 = r9
            X.RaK r8 = new X.RaK
            r8.<init>(r2)
            java.lang.String r1 = "UINT32"
            r0 = 12
            X.RfA r7 = new X.RfA
            r7.<init>(r1, r0)
            java.lang.String r1 = "ENUM"
            r0 = 13
            X.RfA r6 = new X.RfA
            r6.<init>(r1, r0)
            java.lang.String r1 = "SFIXED32"
            r0 = 14
            X.RfA r5 = new X.RfA
            r5.<init>(r1, r0)
            java.lang.String r1 = "SFIXED64"
            r0 = 15
            X.RfA r4 = new X.RfA
            r4.<init>(r1, r0)
            java.lang.String r1 = "SINT32"
            r0 = 16
            X.RfA r3 = new X.RfA
            r3.<init>(r1, r0)
            java.lang.String r2 = "SINT64"
            r1 = 17
            X.RfA r0 = new X.RfA
            r0.<init>(r2, r1)
            r29 = r9
            r30 = r8
            r31 = r7
            r32 = r6
            r33 = r5
            r34 = r4
            r35 = r3
            r36 = r0
            r25 = r13
            r26 = r12
            r27 = r11
            r28 = r10
            r21 = r17
            r22 = r16
            r23 = r15
            r24 = r14
            r20 = r18
            X.RfA[] r0 = new X.EnumC61096RfA[]{r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36}
            X.EnumC61096RfA.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC61096RfA.<clinit>():void");
    }

    public static EnumC61096RfA valueOf(String str) {
        return (EnumC61096RfA) Enum.valueOf(EnumC61096RfA.class, str);
    }

    public static EnumC61096RfA[] values() {
        return (EnumC61096RfA[]) A00.clone();
    }

    public EnumC61096RfA(String str, int i) {
    }
}
