package X;

/* loaded from: classes5.dex */
public final class D5N extends AbstractC23611Dp implements InterfaceC16570sA {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5N(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(6, interfaceC23621Ds);
        this.A05 = i;
        this.A06 = obj;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        D5N d5n;
        if (this.A05 != 0) {
            boolean A1a = AbstractC166987dD.A1a(obj);
            int A0H = AbstractC166987dD.A0H(obj2);
            boolean A1a2 = AbstractC166987dD.A1a(obj5);
            d5n = new D5N(this.A06, (InterfaceC23621Ds) obj6, 1);
            d5n.A03 = A1a;
            d5n.A00 = A0H;
            d5n.A01 = obj3;
            d5n.A02 = obj4;
            d5n.A04 = A1a2;
        } else {
            boolean A1a3 = AbstractC166987dD.A1a(obj2);
            boolean A1a4 = AbstractC166987dD.A1a(obj3);
            int A0H2 = AbstractC166987dD.A0H(obj4);
            d5n = new D5N(this.A06, (InterfaceC23621Ds) obj6, 0);
            d5n.A01 = obj;
            d5n.A03 = A1a3;
            d5n.A04 = A1a4;
            d5n.A00 = A0H2;
            d5n.A02 = obj5;
        }
        return d5n.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019f, code lost:
    
        r46 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a3, code lost:
    
        if (r2 != 11) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a8, code lost:
    
        if (r2 == 3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01aa, code lost:
    
        r47 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r2 != 11) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        if (r1 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b4, code lost:
    
        r18 = r1.A00;
        r17 = r1.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bc, code lost:
    
        r6 = X.AbstractC25231BEo.A0o(r0, r3);
        r2 = X.C83.ONLY_ME;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
    
        if (r6 == r2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c4, code lost:
    
        if (r1 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c6, code lost:
    
        r50 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ca, code lost:
    
        if (r1.A0K != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d0, code lost:
    
        r10 = r1.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d2, code lost:
    
        if (r10 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d4, code lost:
    
        r10 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d6, code lost:
    
        r35 = X.AbstractC166987dD.A19(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01da, code lost:
    
        if (r1 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01dc, code lost:
    
        r9 = r1.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01de, code lost:
    
        if (r9 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e2, code lost:
    
        if (r1 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e4, code lost:
    
        r5 = r1.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e6, code lost:
    
        r8 = X.AbstractC25225BEi.A0F(r4);
        r6 = X.AbstractC25231BEo.A0o(r5, r3);
        r3 = (java.util.Map) r3.getValue();
        r13 = r4.A0G;
        r5 = X.AbstractC25226BEj.A0s(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01fa, code lost:
    
        if (r5 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01fc, code lost:
    
        r5 = r5.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0202, code lost:
    
        if (r3.get(r5) == r2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0204, code lost:
    
        if (r6 != r2) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0206, code lost:
    
        r2 = X.AbstractC25226BEj.A0s(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x020a, code lost:
    
        if (r2 == null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x020c, code lost:
    
        r2 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x020e, code lost:
    
        r3 = 2131952836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0213, code lost:
    
        if (r2 != X.C84.IN_REVIEW) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0215, code lost:
    
        r3 = 2131972699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0218, code lost:
    
        r8 = X.AbstractC25227BEk.A0u(r8, r3);
        r2 = X.AbstractC25226BEj.A0s(r4.A08);
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0224, code lost:
    
        if (r2 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0226, code lost:
    
        r13 = r2.A04;
        r5 = r4.A02;
        r3 = X.AbstractC28459ChB.A00(r5);
        r15 = r2.A0A;
        r6 = X.AbstractC28459ChB.A02(r5);
        r14 = r2.A07;
        r5 = X.AbstractC28459ChB.A01(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x023e, code lost:
    
        if (X.AbstractC25225BEi.A1Y(r13) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0244, code lost:
    
        if (r13.length() > r3) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x024a, code lost:
    
        if (X.AbstractC25225BEi.A1Y(r15) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0250, code lost:
    
        if (r15.length() > r6) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0256, code lost:
    
        if (X.AbstractC25225BEi.A1Y(r14) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x025c, code lost:
    
        if (r14.length() > r5) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c1, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x025e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x025f, code lost:
    
        if (r16 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0261, code lost:
    
        r2 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0265, code lost:
    
        if (r2 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0267, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x026a, code lost:
    
        if (r2.A0L != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026d, code lost:
    
        r2 = com.instagram.aistudio.editor.AiSettingsRepository.A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0271, code lost:
    
        if (r2 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0273, code lost:
    
        r2 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0277, code lost:
    
        if (r2 == X.C84.PUBLISHED_EDITS_DRAFT) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r1 == X.C3PO.A05) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0279, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x027a, code lost:
    
        if (r5 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x027c, code lost:
    
        if (r6 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0280, code lost:
    
        r6 = new X.C45127Jxw(r8, r7, 6);
        r53 = X.C18U.A06(X.C06090Tz.A05, r4, 36330101860025021L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0293, code lost:
    
        if (r1 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0295, code lost:
    
        r1 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02bc, code lost:
    
        return new X.C26050Bfd(r6, r18, r1, r21, r28, r22, r20, r19, r32, r0, r12, r35, r11, r10, r9, r0, r40, r41, r42, r43, r44, r45, r46, r47, r0, r17, r50, r51, r0, r53);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02bd, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x027e, code lost:
    
        r7 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02bf, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x026c, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02c4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02c7, code lost:
    
        r3 = 2131952831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02ca, code lost:
    
        if (r6 != r2) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02ce, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02d1, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01e0, code lost:
    
        r9 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01cc, code lost:
    
        r50 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01ce, code lost:
    
        if (r1 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02d4, code lost:
    
        r18 = null;
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01b0, code lost:
    
        r47 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01a5, code lost:
    
        r46 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02da, code lost:
    
        r44 = false;
        r45 = false;
        r46 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02e2, code lost:
    
        r43 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02e6, code lost:
    
        r41 = false;
        r42 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0156, code lost:
    
        r6 = r1.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0158, code lost:
    
        if (r6 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x015a, code lost:
    
        r32 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r5 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x014a, code lost:
    
        if (r1 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        if (X.AbstractC25231BEo.A0o(r0, r3) == X.C83.ANYONE_WITH_LINK) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (((X.C53010Nci) r54.A06).A06 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0140, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02f4, code lost:
    
        if (r6 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014c, code lost:
    
        r6 = r1.A0A;
        r19 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        if (r6 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        r19 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0154, code lost:
    
        if (r1 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015c, code lost:
    
        if (r2 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015e, code lost:
    
        r8 = r2.ordinal();
        r41 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        if (r8 == 5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0168, code lost:
    
        if (r8 == 6) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016b, code lost:
    
        if (r8 == 7) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016f, code lost:
    
        if (r8 == 8) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0171, code lost:
    
        r41 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0173, code lost:
    
        r42 = X.AbstractC167007dF.A1X(r2, X.C84.IN_REVIEW);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017b, code lost:
    
        if (r8 == 8) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017f, code lost:
    
        if (r8 == 11) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0183, code lost:
    
        if (r8 == 12) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0185, code lost:
    
        r43 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0187, code lost:
    
        if (r2 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0189, code lost:
    
        r44 = X.AbstractC167007dF.A1X(r2, X.C84.PUBLISHED);
        r45 = X.AbstractC167007dF.A1X(r2, X.C84.PUBLISHED_EDITS_IN_REVIEW);
        r2 = r2.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x019a, code lost:
    
        if (r2 == 7) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019d, code lost:
    
        if (r2 == 3) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r55) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
