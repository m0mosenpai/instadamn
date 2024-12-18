package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4EF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EF {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final boolean A03;

    public static final void A00(InterfaceC82443m8 interfaceC82443m8, C4EF c4ef, String str, String str2, String str3, String str4, List list) {
        Long l;
        String str5;
        if (interfaceC82443m8 == null) {
            interfaceC82443m8 = (InterfaceC82443m8) c4ef.A00.remove(str);
        }
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        ArrayList arrayList = new ArrayList(list);
        try {
            for (C4EE c4ee : c4ef.A01.values()) {
                C4EC c4ec = c4ee.A01;
                String str6 = str4;
                if (str4 == null) {
                    str6 = c4ee.A02;
                }
                C14360o3.A0B(str6, 0);
                C12210kP c12210kP = new C12210kP(c4ec.A00);
                c12210kP.A01 = str6;
                c12210kP.A01(C12180kM.A05);
                C18920wW A00 = c12210kP.A00();
                C25531Mh c25531Mh = new C25531Mh(A00.A00(A00.A00, "merlin_second_channel"), 340);
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C27903CRo c27903CRo = (C27903CRo) it.next();
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A04("visibility", Double.valueOf(c27903CRo.A00));
                        c0Zx.A05("ts", Long.valueOf(c27903CRo.A01));
                        int intValue = c27903CRo.A02.intValue();
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue == 3) {
                                        str5 = "exit_coverage";
                                    } else {
                                        str5 = "unknown";
                                    }
                                } else {
                                    str5 = "enter_coverage";
                                }
                            } else {
                                str5 = "exit_visibility";
                            }
                        } else {
                            str5 = "enter_visibility";
                        }
                        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str5);
                        arrayList2.add(c0Zx);
                    }
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A07("visibility_ts", arrayList2);
                    c25531Mh.A0R("origin", str2);
                    c25531Mh.A0R("entity_id", str);
                    c25531Mh.A0M(EnumC63542ub.UNKNOWN, "purpose");
                    c25531Mh.A0N(c0Zx2, AbstractC111324zv.A00(4360));
                    c25531Mh.A0R("visibility_detection_framework", str3);
                    if (interfaceC82443m8 != null) {
                        if (!(interfaceC82443m8 instanceof J2P)) {
                            Class<?> cls = interfaceC82443m8.getClass();
                            Map map = C0YZ.A03;
                            C14360o3.A0B(cls, 1);
                            C0K8.A0C("IgSecondChannelMerlinLoggerExtraDataAttacher", AnonymousClass001.A0R("Cannot attach extra data of type ", AbstractC13230m9.A01(cls)));
                        } else {
                            J2P j2p = (J2P) interfaceC82443m8;
                            c25531Mh.A0R("tracking", null);
                            ((AbstractC02600Aj) c25531Mh).A00.A9M("two_measurement_debugging_fields", j2p.A04);
                            c25531Mh.A0R("tracking_token", j2p.A03);
                            C0Zx c0Zx3 = new C0Zx();
                            c0Zx3.A06("multi_ads_id", j2p.A01);
                            c0Zx3.A03("is_multi_ads", Boolean.valueOf(j2p.A05));
                            c0Zx3.A06("surface", j2p.A02);
                            if (j2p.A00 != null) {
                                l = Long.valueOf(r0.intValue());
                            } else {
                                l = null;
                            }
                            c0Zx3.A05("multi_ads_type", l);
                            c25531Mh.A0N(c0Zx3, "ig_extra_payload");
                        }
                    }
                    c25531Mh.Cht();
                }
            }
        } catch (Exception e) {
            C0K8.A0C("SecondChannelMerlinManager", e.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: Exception -> 0x00d6, all -> 0x0123, TryCatch #1 {Exception -> 0x00d6, blocks: (B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:33:0x00ca), top: B:26:0x00b5, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2 A[Catch: all -> 0x0123, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x0019, B:11:0x002b, B:15:0x0039, B:19:0x0046, B:20:0x0049, B:23:0x0052, B:25:0x005a, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:33:0x00ca, B:39:0x00e2, B:41:0x00ea, B:42:0x00f6, B:45:0x00d7, B:46:0x006d, B:48:0x0075, B:49:0x0079, B:51:0x0081, B:52:0x0088, B:55:0x00ad, B:59:0x0091, B:61:0x0099, B:62:0x00a5, B:64:0x00fa, B:66:0x0108, B:67:0x010f), top: B:4:0x0004, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A01(X.C38638Gyf r17) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4EF.A01(X.Gyf):void");
    }

    public C4EF(List list, boolean z) {
        this.A03 = z;
        this.A01 = new LinkedHashMap();
        this.A02 = new HashMap();
        this.A00 = new HashMap();
        for (Object obj : list) {
            C14360o3.A0B(obj, 0);
            Map map = this.A01;
            Class<?> cls = obj.getClass();
            if (!map.containsKey(new C0YZ(cls))) {
                map.put(new C0YZ(cls), obj);
            }
        }
    }

    public C4EF() {
        this(C16930sl.A00, false);
    }
}
