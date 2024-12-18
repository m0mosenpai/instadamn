package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.quickpromotion.model.FilterType;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2z3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66272z3 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [X.GBk, java.lang.Object] */
    public final C5OX A00(InterfaceC94534Ng interfaceC94534Ng, C49I c49i, C94574Nk c94574Nk) {
        Boolean bool;
        Boolean bool2;
        Integer num;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Integer num2;
        Boolean bool6;
        Boolean bool7;
        Integer num3;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Integer num4;
        Integer num5;
        Boolean bool11;
        Integer num6;
        Integer num7;
        Boolean bool12;
        String str;
        Boolean bool13;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
        EnumC72370Xc6 enumC72370Xc6;
        EnumC72347Xbj enumC72347Xbj;
        Integer num8;
        Integer num9;
        C5OV c5ov;
        Integer num10;
        C14360o3.A0B(c94574Nk, 2);
        C49H c49h = c49i.A05;
        C94494Nb c94494Nb = c94574Nk.A00;
        try {
            Context context = c49h.A00;
            final UserSession userSession = c49h.A02;
            C55732hE c55732hE = c49h.A03;
            FilterType filterType = c94494Nb.A00;
            switch (filterType.ordinal()) {
                case 0:
                    C94514Ne c94514Ne = c94494Nb.A01;
                    if (c94514Ne != null && (num9 = c94514Ne.A01) != null) {
                        final int intValue = num9.intValue();
                        c5ov = new C5OV(intValue) { // from class: X.93A
                            public final long A00;

                            @Override // X.C5OV
                            public final boolean E3b(C5OW c5ow) {
                                C14360o3.A0B(c5ow, 0);
                                if (System.currentTimeMillis() - c5ow.A01(C05F.A00) <= this.A00) {
                                    return false;
                                }
                                return true;
                            }

                            {
                                this.A00 = TimeUnit.SECONDS.toMillis(intValue);
                            }
                        };
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 1:
                    c5ov = new C36593GBr(userSession);
                    break;
                case 2:
                    C94514Ne c94514Ne2 = c94494Nb.A01;
                    C94514Ne A00 = c94494Nb.A00("event");
                    C94514Ne A002 = c94494Nb.A00("event_count");
                    C94514Ne A003 = c94494Nb.A00("metric");
                    if (c94514Ne2 != null && A00 != null && A002 != null && A003 != null) {
                        EnumC72370Xc6[] values = EnumC72370Xc6.values();
                        int length = values.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                enumC72370Xc6 = values[i];
                                if (!AbstractC002300n.A0g(enumC72370Xc6.name(), A00.A03, true)) {
                                    i++;
                                }
                            } else {
                                enumC72370Xc6 = null;
                            }
                        }
                        EnumC72347Xbj[] values2 = EnumC72347Xbj.values();
                        int length2 = values2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                enumC72347Xbj = values2[i2];
                                if (!AbstractC002300n.A0g(enumC72347Xbj.name(), A003.A03, true)) {
                                    i2++;
                                }
                            } else {
                                enumC72347Xbj = null;
                            }
                        }
                        String str2 = c94514Ne2.A03;
                        if (str2 != null && str2.length() != 0 && enumC72370Xc6 != null && enumC72347Xbj != null && (num8 = A002.A01) != null) {
                            c5ov = new YFR(enumC72370Xc6, enumC72347Xbj, str2, num8.intValue());
                            break;
                        }
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 3:
                    C94514Ne c94514Ne3 = c94494Nb.A01;
                    if (c94514Ne3 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne3.A02) && (bool16 = c94514Ne3.A00) != null) {
                        c5ov = new YFQ(context, bool16.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 4:
                    C94514Ne c94514Ne4 = c94494Nb.A01;
                    if (c94514Ne4 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne4.A02) && (bool15 = c94514Ne4.A00) != null) {
                        c5ov = new YFP(context, bool15.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 5:
                    C94514Ne c94514Ne5 = c94494Nb.A01;
                    if (c94514Ne5 != null) {
                        Boolean bool17 = c94514Ne5.A00;
                        if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne5.A02) && bool17 != null) {
                            c5ov = new C64499TGl(context, bool17.booleanValue());
                            break;
                        }
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 6:
                    c5ov = new C36594GBs(userSession);
                    break;
                case 7:
                    C94514Ne c94514Ne6 = c94494Nb.A01;
                    if (c94514Ne6 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne6.A02) && (bool14 = c94514Ne6.A00) != null) {
                        c5ov = new C49553Lv7(userSession, bool14.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 8:
                    ?? obj = new Object();
                    obj.A00 = userSession;
                    c5ov = obj;
                    break;
                case 9:
                    C94514Ne c94514Ne7 = c94494Nb.A01;
                    if (c94514Ne7 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne7.A02) && (bool13 = c94514Ne7.A00) != null) {
                        c5ov = new GC4(context, bool13.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 10:
                    C94514Ne c94514Ne8 = c94494Nb.A01;
                    if (c94514Ne8 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne8.A02) && c94514Ne8.A00 != null) {
                        c5ov = new C23995AkZ(context);
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 11:
                    C94514Ne c94514Ne9 = c94494Nb.A01;
                    if (c94514Ne9 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne9.A02) && c94514Ne9.A00 != null) {
                        c5ov = new C23996Aka(context);
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    C94514Ne c94514Ne10 = c94494Nb.A01;
                    if (c94514Ne10 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne10.A02) && c94514Ne10.A00 != null) {
                        c5ov = new C23997Akb(context);
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    C94514Ne c94514Ne11 = c94494Nb.A01;
                    if (c94514Ne11 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne11.A02) && c94514Ne11.A00 != null) {
                        c5ov = new C36596GBu(userSession);
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 14:
                case 21:
                default:
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case Process.SIGTERM /* 15 */:
                    C94514Ne c94514Ne12 = c94494Nb.A01;
                    if (c94514Ne12 != null && (num7 = c94514Ne12.A01) != null) {
                        c5ov = new GCC(userSession, num7.intValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 16:
                    C94514Ne c94514Ne13 = c94494Nb.A01;
                    if (c94514Ne13 != null && (num6 = c94514Ne13.A01) != null) {
                        c5ov = new C49554Lv8(userSession, C13920nI.A00, num6);
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 17:
                    C94514Ne c94514Ne14 = c94494Nb.A01;
                    if (c94514Ne14 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne14.A02) && (str = c94514Ne14.A03) != null) {
                        c5ov = new GC9(userSession, str);
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 18:
                    C94514Ne c94514Ne15 = c94494Nb.A01;
                    if (c94514Ne15 != null && (bool12 = c94514Ne15.A00) != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne15.A02)) {
                        c5ov = new GCF(context, bool12.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case Process.SIGSTOP /* 19 */:
                    C94514Ne c94514Ne16 = c94494Nb.A01;
                    if (c94514Ne16 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne16.A02) && (num5 = c94514Ne16.A01) != null) {
                        c5ov = new C36590GBo(num5.intValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 20:
                    C94514Ne c94514Ne17 = c94494Nb.A01;
                    if (c94514Ne17 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne17.A02) && (num4 = c94514Ne17.A01) != null) {
                        c5ov = new C36591GBp(num4.intValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 22:
                    C94514Ne c94514Ne18 = c94494Nb.A01;
                    if (c94514Ne18 != null && (bool11 = c94514Ne18.A00) != null) {
                        c5ov = new GCB(userSession, bool11.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 23:
                    C94514Ne c94514Ne19 = c94494Nb.A01;
                    if (c94514Ne19 != null && (bool10 = c94514Ne19.A00) != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne19.A02)) {
                        c5ov = new GCJ(userSession, context, bool10.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 24:
                    c5ov = new GCL(context, userSession);
                    break;
                case 25:
                    c5ov = new C64498TGk(context, userSession);
                    break;
                case 26:
                    C94514Ne c94514Ne20 = c94494Nb.A01;
                    if (c94514Ne20 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne20.A02) && c94514Ne20.A00 != null) {
                        c5ov = new YFN(context);
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 27:
                    C94514Ne c94514Ne21 = c94494Nb.A01;
                    if (c94514Ne21 != null && (bool9 = c94514Ne21.A00) != null && c55732hE != null) {
                        c5ov = new GC1(c55732hE, bool9.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 28:
                    C94514Ne c94514Ne22 = c94494Nb.A01;
                    if (c94514Ne22 != null && (bool8 = c94514Ne22.A00) != null) {
                        c5ov = new C36600GBy(userSession, bool8.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                case 32:
                case 34:
                case 35:
                case 36:
                case 51:
                case 52:
                    C94514Ne c94514Ne23 = c94494Nb.A01;
                    String obj2 = filterType.toString();
                    C14360o3.A0B(obj2, 2);
                    Boolean bool18 = null;
                    if (c94514Ne23 != null) {
                        bool18 = c94514Ne23.A00;
                    }
                    if (c55732hE != null && bool18 != null) {
                        c5ov = new GCK(c55732hE, obj2, bool18.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 31:
                    C94514Ne c94514Ne24 = c94494Nb.A01;
                    Integer num11 = null;
                    if (c94514Ne24 != null) {
                        num11 = c94514Ne24.A01;
                    }
                    if (c55732hE != null && num11 != null) {
                        c5ov = new GC0(c55732hE, num11.intValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 33:
                    C94514Ne c94514Ne25 = c94494Nb.A01;
                    if (c55732hE != null && c94514Ne25 != null && (num3 = c94514Ne25.A01) != null) {
                        c5ov = new GC3(c55732hE, num3.intValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 37:
                    c5ov = new C49551Lv5(userSession);
                    break;
                case 38:
                    c5ov = new JYN(userSession);
                    break;
                case 39:
                    c5ov = new C43781JXu(userSession);
                    break;
                case 40:
                    C94514Ne c94514Ne26 = c94494Nb.A01;
                    if (c94514Ne26 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne26.A02) && (bool7 = c94514Ne26.A00) != null) {
                        c5ov = new YFO(userSession, bool7.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case Seq.NULL_REFNUM /* 41 */:
                    C94514Ne c94514Ne27 = c94494Nb.A01;
                    if (c94514Ne27 != null && IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equalsIgnoreCase(c94514Ne27.A02) && (bool6 = c94514Ne27.A00) != null) {
                        c5ov = new C36599GBx(userSession, bool6.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                    c5ov = new C36589GBn(userSession);
                    break;
                case 43:
                    c5ov = new C36597GBv(userSession);
                    break;
                case 44:
                    c5ov = new C49552Lv6(userSession);
                    break;
                case 45:
                    c5ov = new C36592GBq(userSession);
                    break;
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    C94514Ne c94514Ne28 = c94494Nb.A01;
                    if (c94514Ne28 != null && (num2 = c94514Ne28.A01) != null) {
                        c5ov = new GCH(userSession, num2.intValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 47:
                    c5ov = new C23998Akc(userSession, context);
                    break;
                case 48:
                    C94514Ne c94514Ne29 = c94494Nb.A01;
                    if (c94514Ne29 != null && (bool5 = c94514Ne29.A00) != null) {
                        c5ov = new GC6(userSession, bool5.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 49:
                    C94514Ne c94514Ne30 = c94494Nb.A01;
                    if (c94514Ne30 != null && (bool4 = c94514Ne30.A00) != null) {
                        c5ov = new GC7(userSession, bool4.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    C94514Ne A004 = c94494Nb.A00("first");
                    C94514Ne A005 = c94494Nb.A00("second");
                    Integer num12 = null;
                    if (A004 != null) {
                        num10 = A004.A01;
                    } else {
                        num10 = null;
                    }
                    if (A005 != null) {
                        num12 = A005.A01;
                    }
                    if (num10 != null && num12 != null) {
                        c5ov = new GCD(Long.valueOf(num10.intValue()), Long.valueOf(num12.intValue()));
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 53:
                    c5ov = new C5OZ(userSession);
                    break;
                case 54:
                    c5ov = new GC2(userSession, c55732hE);
                    break;
                case 55:
                    c5ov = new C36588GBm(userSession);
                    break;
                case 56:
                    c5ov = new C36587GBl(userSession);
                    break;
                case 57:
                    C94514Ne c94514Ne31 = c94494Nb.A01;
                    if (c94514Ne31 != null && (bool3 = c94514Ne31.A00) != null) {
                        c5ov = new GC5(userSession, bool3.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 58:
                    c5ov = new Object();
                    break;
                case 59:
                    C94514Ne c94514Ne32 = c94494Nb.A01;
                    if (c94514Ne32 != null && (num = c94514Ne32.A01) != null) {
                        c5ov = new GCG(userSession, num.intValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 60:
                    c5ov = new C5OV(userSession) { // from class: X.5Ob
                        public final C17280tP A00 = C17280tP.A4E.A00();
                        public final String A01;

                        /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
                        
                            if (((java.lang.Number) r4.A0C.CES(r4, r7[237(0xed, float:3.32E-43)])).intValue() >= ((java.lang.Number) r2.CES(r4, r7[236(0xec, float:3.31E-43)])).intValue()) goto L14;
                         */
                        @Override // X.C5OV
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean E3b(X.C5OW r10) {
                            /*
                                r9 = this;
                                java.lang.String r5 = r9.A01
                                r8 = 0
                                if (r5 == 0) goto L6a
                                X.0tP r4 = r9.A00
                                X.0ry r3 = r4.A05
                                X.0YR[] r7 = X.C17280tP.A4G
                                r0 = 235(0xeb, float:3.3E-43)
                                r0 = r7[r0]
                                java.lang.Object r0 = r3.CES(r4, r0)
                                java.util.Set r0 = (java.util.Set) r0
                                boolean r0 = r0.contains(r5)
                                if (r0 == 0) goto L6a
                                X.0ry r1 = r4.A0D
                                r0 = 234(0xea, float:3.28E-43)
                                r0 = r7[r0]
                                java.lang.Object r0 = r1.CES(r4, r0)
                                java.lang.Boolean r0 = (java.lang.Boolean) r0
                                boolean r0 = r0.booleanValue()
                                if (r0 == 0) goto L6a
                                java.util.Set r0 = r4.A0A()
                                boolean r0 = r0.contains(r5)
                                r6 = 1
                                if (r0 == 0) goto L6b
                                X.0ry r2 = r4.A0B
                                r0 = 236(0xec, float:3.31E-43)
                                r0 = r7[r0]
                                java.lang.Object r0 = r2.CES(r4, r0)
                                java.lang.Number r0 = (java.lang.Number) r0
                                int r0 = r0.intValue()
                                if (r0 < 0) goto L6b
                                X.0ry r1 = r4.A0C
                                r0 = 237(0xed, float:3.32E-43)
                                r0 = r7[r0]
                                java.lang.Object r0 = r1.CES(r4, r0)
                                java.lang.Number r0 = (java.lang.Number) r0
                                int r1 = r0.intValue()
                                r0 = 236(0xec, float:3.31E-43)
                                r0 = r7[r0]
                                java.lang.Object r0 = r2.CES(r4, r0)
                                java.lang.Number r0 = (java.lang.Number) r0
                                int r0 = r0.intValue()
                                if (r1 < r0) goto L6b
                            L6a:
                                return r8
                            L6b:
                                r2 = 235(0xeb, float:3.3E-43)
                                r0 = r7[r2]
                                java.lang.Object r0 = r3.CES(r4, r0)
                                java.util.Set r0 = (java.util.Set) r0
                                java.util.Set r1 = X.AnonymousClass090.A03(r5, r0)
                                r0 = r7[r2]
                                r3.Egi(r4, r1, r0)
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C116225Ob.E3b(X.5OW):boolean");
                        }

                        {
                            this.A01 = userSession.userId;
                        }
                    };
                    break;
                case 61:
                    c5ov = new C5OV() { // from class: X.5OU
                        public final C17280tP A00 = C17280tP.A4E.A00();

                        @Override // X.C5OV
                        public final boolean E3b(C5OW c5ow) {
                            C17280tP c17280tP = this.A00;
                            return ((Boolean) c17280tP.A0A.CES(c17280tP, C17280tP.A4G[238])).booleanValue();
                        }
                    };
                    break;
                case 62:
                    C94514Ne c94514Ne33 = c94494Nb.A01;
                    if (c94514Ne33 != null && (bool2 = c94514Ne33.A00) != null) {
                        c5ov = new GCA(userSession, bool2.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case StringTreeSet.PAYLOAD_MASK /* 63 */:
                    C94514Ne c94514Ne34 = c94494Nb.A01;
                    if (c94514Ne34 != null && (bool = c94514Ne34.A00) != null) {
                        c5ov = new GC8(userSession, bool.booleanValue());
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 64:
                    List list = c94494Nb.A03;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str3 = ((C94514Ne) it.next()).A03;
                            if (str3 == null) {
                                str3 = "";
                            }
                            arrayList.add(str3);
                        }
                        c5ov = new GCE(userSession, arrayList);
                        break;
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
                case 65:
                    c5ov = new C36601GBz(userSession, c55732hE);
                    break;
                case 66:
                    c5ov = new GCI(userSession);
                    break;
                case 67:
                    c5ov = new C36595GBt(userSession);
                    break;
                case 68:
                    String str4 = c94494Nb.A02;
                    if (str4 != null) {
                        if ("ERROR".equals(str4)) {
                            throw new Exception();
                        }
                        if ("PASS".equals(str4) || "FAIL".equals(str4)) {
                            c5ov = new C36598GBw(str4);
                            break;
                        }
                    }
                    throw new RuntimeException(AnonymousClass001.A0R("Failed to create filter of type ", c94494Nb.A00.name()));
            }
            try {
                if (!c5ov.E3b(new C5OW(c49h.A01, ((C94524Nf) interfaceC94534Ng).A01.A0D))) {
                    return new C5OX(ImmutableList.of((Object) c94574Nk), null, false);
                }
                return new C5OX(null, null, true);
            } catch (Exception e) {
                throw e;
            }
        } catch (C902240h e2) {
            throw new RuntimeException("Failed to create filter handler", e2);
        }
    }
}
