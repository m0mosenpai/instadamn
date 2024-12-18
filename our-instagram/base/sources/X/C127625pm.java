package X;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.location.platform.api.Location;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127625pm extends C907642p {
    public static final C103734lr A00 = new C103734lr(C03250Di.A00, RealtimeSinceBootClock.A00);

    /* JADX WARN: Type inference failed for: r0v9, types: [X.42p, X.5pm] */
    public static C127625pm A00(Boolean bool, Integer num, String str, String str2, List list, List list2) {
        String str3;
        C127685ps A01 = A01(bool, num, "0", str, str2, list, list2);
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            A0A.A0r("input");
            A0A.A0d();
            Integer num2 = A01.A06;
            if (num2 != null) {
                if (1 - num2.intValue() != 0) {
                    str3 = MSV.A00(75);
                } else {
                    str3 = "BACKGROUND";
                }
                A0A.A0S("app_use_state", str3);
            }
            String str4 = A01.A09;
            if (str4 != null) {
                A0A.A0S(AbstractC58461Pvm.A00(0, 9, 5), str4);
            }
            String str5 = A01.A0A;
            if (str5 != null) {
                A0A.A0S("family_device_id", str5);
            }
            C127675pr c127675pr = A01.A03;
            if (c127675pr != null) {
                A0A.A0r("location_manager_info");
                A0A.A0d();
                List<C201128uu> list3 = c127675pr.A00;
                if (list3 != null) {
                    C16V.A03(A0A, "locations");
                    for (C201128uu c201128uu : list3) {
                        if (c201128uu != null) {
                            A0A.A0d();
                            A0A.A0R("age_ms", c201128uu.A03);
                            A0A.A0O(Location.LATITUDE, c201128uu.A00);
                            A0A.A0O("longitude", c201128uu.A01);
                            A0A.A0P(AbstractC58317Pt9.A00(214), c201128uu.A02);
                            Float f = c201128uu.A07;
                            if (f != null) {
                                A0A.A0P("speed_meters_per_second", f.floatValue());
                            }
                            Double d = c201128uu.A05;
                            if (d != null) {
                                A0A.A0O("altitude_meters", d.doubleValue());
                            }
                            Float f2 = c201128uu.A06;
                            if (f2 != null) {
                                A0A.A0P("bearing_degrees", f2.floatValue());
                            }
                            Boolean bool2 = c201128uu.A04;
                            if (bool2 != null) {
                                A0A.A0T("is_spoofed", bool2.booleanValue());
                            }
                            A0A.A0a();
                        }
                    }
                    A0A.A0Z();
                }
                A0A.A0a();
            }
            C127635pn c127635pn = A01.A04;
            if (c127635pn != null) {
                A0A.A0r("wifi_info");
                AbstractC127705pu.A00(c127635pn, A0A);
            }
            C127645po c127645po = A01.A02;
            if (c127645po != null) {
                A0A.A0r("bluetooth_info");
                AbstractC127715pv.A00(c127645po, A0A);
            }
            C127655pp c127655pp = A01.A00;
            if (c127655pp != null) {
                A0A.A0r("cell_info");
                A0A.A0d();
                if (c127655pp.A05 != null) {
                    C16V.A03(A0A, "scan_results");
                    for (C201148uw c201148uw : c127655pp.A05) {
                        if (c201148uw != null) {
                            A0A.A0d();
                            A0A.A0R("age_ms", c201148uw.A00);
                            if (c201148uw.A01 != null) {
                                A0A.A0r("cdma_info");
                                AbstractC72553XgQ.A00(c201148uw.A01, A0A);
                            }
                            if (c201148uw.A02 != null) {
                                A0A.A0r("gsm_info");
                                C22949A9t c22949A9t = c201148uw.A02;
                                A0A.A0d();
                                A0A.A0Q("cell_id", c22949A9t.A01);
                                A0A.A0Q("location_area_code", c22949A9t.A02);
                                A0A.A0Q("mobile_country_code", c22949A9t.A03);
                                A0A.A0Q("mobile_network_code", c22949A9t.A04);
                                A0A.A0Q("primary_scrambling_code", c22949A9t.A05);
                                A0A.A0Q("rssi_dbm", c22949A9t.A06);
                                A0A.A0Q("arfcn", c22949A9t.A00);
                                A0A.A0a();
                            }
                            if (c201148uw.A03 != null) {
                                A0A.A0r("lte_info");
                                C201158ux c201158ux = c201148uw.A03;
                                A0A.A0d();
                                A0A.A0Q("cell_id", c201158ux.A00);
                                A0A.A0Q("mobile_country_code", c201158ux.A02);
                                A0A.A0Q("mobile_network_code", c201158ux.A03);
                                A0A.A0Q("physical_cell_id", c201158ux.A04);
                                A0A.A0Q("tracking_area_code", c201158ux.A07);
                                A0A.A0Q("rssi_dbm", c201158ux.A05);
                                A0A.A0Q("timing_advance", c201158ux.A06);
                                A0A.A0Q("earfcn", c201158ux.A01);
                                A0A.A0a();
                            }
                            if (c201148uw.A04 != null) {
                                A0A.A0r("wcdma_info");
                                C22950A9u c22950A9u = c201148uw.A04;
                                A0A.A0d();
                                A0A.A0Q("cell_id", c22950A9u.A00);
                                A0A.A0Q("location_area_code", c22950A9u.A01);
                                A0A.A0Q("mobile_country_code", c22950A9u.A02);
                                A0A.A0Q("mobile_network_code", c22950A9u.A03);
                                A0A.A0Q("primary_scrambling_code", c22950A9u.A04);
                                A0A.A0Q("rssi_dbm", c22950A9u.A05);
                                A0A.A0Q("uarfcn", c22950A9u.A06);
                                A0A.A0a();
                            }
                            A0A.A0a();
                        }
                    }
                    A0A.A0Z();
                }
                if (c127655pp.A04 != null) {
                    C16V.A03(A0A, RealtimeConstants.MQTT_CONNECTED);
                    for (C127665pq c127665pq : c127655pp.A04) {
                        if (c127665pq != null) {
                            A0A.A0d();
                            String str6 = c127665pq.A04;
                            if (str6 != null) {
                                A0A.A0S(MSV.A00(111), str6);
                            }
                            String str7 = c127665pq.A01;
                            if (str7 != null) {
                                A0A.A0S("network_country_iso", str7);
                            }
                            String str8 = c127665pq.A02;
                            if (str8 != null) {
                                A0A.A0S("network_operator_mcc_mnc", str8);
                            }
                            String str9 = c127665pq.A03;
                            if (str9 != null) {
                                A0A.A0S("network_operator_name", str9);
                            }
                            A0A.A0T("is_network_roaming", c127665pq.A05);
                            if (c127665pq.A00 != null) {
                                A0A.A0r("cdma_info");
                                AbstractC72553XgQ.A00(c127665pq.A00, A0A);
                            }
                            A0A.A0a();
                        }
                    }
                    A0A.A0Z();
                }
                String str10 = c127655pp.A00;
                if (str10 != null) {
                    A0A.A0S("phone_type", str10);
                }
                String str11 = c127655pp.A01;
                if (str11 != null) {
                    A0A.A0S("sim_country_iso", str11);
                }
                String str12 = c127655pp.A02;
                if (str12 != null) {
                    A0A.A0S("sim_operator_mcc_mnc", str12);
                }
                String str13 = c127655pp.A03;
                if (str13 != null) {
                    A0A.A0S("sim_operator_name", str13);
                }
                A0A.A0T("has_icc_card", c127655pp.A06);
                A0A.A0a();
            }
            C201168uy c201168uy = A01.A01;
            if (c201168uy != null) {
                A0A.A0r("extra_info");
                A0A.A0d();
                C22817A4m c22817A4m = c201168uy.A00;
                if (c22817A4m != null) {
                    A0A.A0r("live_location_sharing_data");
                    A0A.A0d();
                    List<Number> list4 = c22817A4m.A00;
                    if (list4 != null) {
                        C16V.A03(A0A, "session_ids");
                        for (Number number : list4) {
                            if (number != null) {
                                A0A.A0i(number.longValue());
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0a();
                }
                A0A.A0a();
            }
            String str14 = A01.A0B;
            if (str14 != null) {
                A0A.A0S("place_id", str14);
            }
            String str15 = A01.A08;
            if (str15 != null) {
                A0A.A0S("collection_source", str15);
            }
            Boolean bool3 = A01.A05;
            if (bool3 != null) {
                A0A.A0T("anonymous_signals", bool3.booleanValue());
            }
            if (A01.A07 != null) {
                A0A.A0S("use_case", "INTEGRITY");
            }
            A0A.A0S("client_mutation_id", ((AbstractC127695pt) A01).A01);
            String str16 = ((AbstractC127695pt) A01).A00;
            if (str16 != null) {
                A0A.A0S("actor_id", str16);
            }
            A0A.A0a();
            A0A.A0a();
            A0A.close();
            return new C907642p(C127725pw.class, "FbLocationUpdateMutation", stringWriter.toString(), true);
        } catch (IOException e) {
            C0K8.A0G("FbLocationUpdateMutation", "Error serializing to JSON", e);
            C0w9.A06("FbLocationUpdateMutation", "Error serializing to JSON", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.8uy] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.Xlt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.XnY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.5pt, X.5ps] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.A4m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [X.Xmx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object, X.8uv] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, X.8uv] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, X.A9u] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.8ux, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, X.A9t] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.5pr] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, X.8uu] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.8uw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.Xlt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.XnY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, X.5pq] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.5pp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.5po, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.5pn, java.lang.Object] */
    public static C127685ps A01(Boolean bool, Integer num, String str, String str2, String str3, List list, List list2) {
        Double d;
        boolean isFromMockProvider;
        Float valueOf;
        ArrayList arrayList = new ArrayList(list.size());
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        Iterator it = list.iterator();
        C201168uy c201168uy = null;
        c201168uy = null;
        String str4 = null;
        String str5 = null;
        while (it.hasNext()) {
            C202098wp c202098wp = (C202098wp) it.next();
            C103804lz c103804lz = c202098wp.A02;
            if (c103804lz != null) {
                ?? obj4 = new Object();
                android.location.Location location = c103804lz.A00;
                obj4.A00 = location.getLatitude();
                obj4.A01 = location.getLongitude();
                obj4.A03 = (int) A00.A00(c103804lz);
                Float A01 = c103804lz.A01();
                if (A01 != null) {
                    obj4.A02 = A01.floatValue();
                }
                Double A002 = c103804lz.A00();
                if (A002 != null) {
                    obj4.A05 = A002;
                }
                Float A02 = c103804lz.A02();
                if (A02 != null) {
                    obj4.A06 = A02;
                }
                if (location.hasSpeed() && (valueOf = Float.valueOf(location.getSpeed())) != null) {
                    obj4.A07 = valueOf;
                }
                Boolean bool2 = c103804lz.A01;
                if (bool2 != null) {
                    isFromMockProvider = bool2.booleanValue();
                } else {
                    isFromMockProvider = location.isFromMockProvider();
                }
                Boolean valueOf2 = Boolean.valueOf(isFromMockProvider);
                if (valueOf2 != null) {
                    obj4.A04 = valueOf2;
                }
                arrayList.add(obj4);
            }
            Boolean bool3 = c202098wp.A07;
            if (bool3 != null) {
                obj.A01 = bool3;
            }
            C63282Sgh c63282Sgh = c202098wp.A03;
            if (c63282Sgh != null) {
                System.currentTimeMillis();
                String str6 = c63282Sgh.A07;
                int i = c63282Sgh.A02;
                String str7 = c63282Sgh.A08;
                Integer num2 = c63282Sgh.A00;
                ?? obj5 = new Object();
                obj5.A01 = null;
                obj5.A03 = str6;
                obj5.A00 = i;
                obj5.A04 = str7;
                obj5.A02 = num2;
                obj.A00 = obj5;
            }
            List<C63282Sgh> list3 = c202098wp.A0N;
            if (list3 != null) {
                if (obj.A02 == null) {
                    obj.A02 = new ArrayList(list3.size());
                }
                for (C63282Sgh c63282Sgh2 : list3) {
                    List list4 = obj.A02;
                    Integer valueOf3 = Integer.valueOf((int) (System.currentTimeMillis() - c63282Sgh2.A03));
                    String str8 = c63282Sgh2.A07;
                    int i2 = c63282Sgh2.A02;
                    String str9 = c63282Sgh2.A08;
                    Integer num3 = c63282Sgh2.A00;
                    ?? obj6 = new Object();
                    obj6.A01 = valueOf3;
                    obj6.A03 = str8;
                    obj6.A00 = i2;
                    obj6.A04 = str9;
                    obj6.A02 = num3;
                    list4.add(obj6);
                }
            }
            Boolean bool4 = c202098wp.A04;
            if (bool4 != null) {
                obj2.A00 = bool4;
            }
            List<SI9> list5 = c202098wp.A0I;
            if (list5 != null) {
                if (obj2.A01 == null) {
                    obj2.A01 = new ArrayList(list5.size());
                }
                for (SI9 si9 : list5) {
                    List list6 = obj2.A01;
                    int currentTimeMillis = (int) (System.currentTimeMillis() - si9.A02);
                    String str10 = si9.A03;
                    int i3 = si9.A00;
                    String str11 = si9.A04;
                    ?? obj7 = new Object();
                    obj7.A00 = currentTimeMillis;
                    obj7.A02 = str10;
                    obj7.A01 = i3;
                    obj7.A03 = str11;
                    list6.add(obj7);
                }
            }
            String str12 = c202098wp.A0C;
            if (str12 != null) {
                str4 = str12;
            }
            String str13 = c202098wp.A0E;
            if (str13 != null) {
                str5 = str13;
            }
            List<CellInfo> list7 = c202098wp.A0J;
            C202078wn c202078wn = c202098wp.A00;
            if (c202078wn != null) {
                obj3.A00 = c202078wn.A05;
                obj3.A01 = c202078wn.A06;
                obj3.A02 = c202078wn.A07;
                obj3.A03 = c202078wn.A08;
                obj3.A06 = c202078wn.A09;
                ?? obj8 = new Object();
                obj8.A04 = c202078wn.A04;
                obj8.A01 = c202078wn.A01;
                obj8.A02 = c202078wn.A02;
                obj8.A03 = c202078wn.A03;
                obj8.A05 = c202078wn.A0A;
                C202088wo c202088wo = c202078wn.A00;
                if (c202088wo != null) {
                    ?? obj9 = new Object();
                    obj8.A00 = obj9;
                    obj9.A00 = c202088wo.A00;
                    Double d2 = c202088wo.A03;
                    if (d2 != null && (d = c202088wo.A04) != null) {
                        ?? obj10 = new Object();
                        obj9.A08 = obj10;
                        obj10.A00 = d2.doubleValue();
                        obj10.A01 = d.doubleValue();
                    }
                    obj9.A07 = c202088wo.A02;
                }
                ArrayList arrayList2 = new ArrayList();
                obj3.A04 = arrayList2;
                arrayList2.add(obj8);
            }
            obj3.A05 = new ArrayList();
            if (list7 != null) {
                for (CellInfo cellInfo : list7) {
                    ?? obj11 = new Object();
                    obj11.A00 = cellInfo.getTimeStamp();
                    if (cellInfo instanceof CellInfoCdma) {
                        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                        ?? obj12 = new Object();
                        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                        obj12.A00 = cellIdentity.getBasestationId();
                        ?? obj13 = new Object();
                        obj12.A08 = obj13;
                        obj13.A00 = cellIdentity.getLatitude();
                        obj12.A08.A01 = cellIdentity.getLongitude();
                        obj12.A06 = cellIdentity.getNetworkId();
                        obj12.A07 = cellIdentity.getSystemId();
                        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
                        obj12.A02 = cellSignalStrength.getDbm();
                        obj12.A01 = cellSignalStrength.getCdmaEcio();
                        obj12.A04 = cellSignalStrength.getEvdoDbm();
                        obj12.A03 = cellSignalStrength.getEvdoEcio();
                        obj12.A05 = cellSignalStrength.getEvdoSnr();
                        obj11.A01 = obj12;
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        ?? obj14 = new Object();
                        CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                        obj14.A01 = cellIdentity2.getCid();
                        obj14.A02 = cellIdentity2.getLac();
                        obj14.A03 = cellIdentity2.getMcc();
                        obj14.A04 = cellIdentity2.getMnc();
                        obj14.A05 = cellIdentity2.getPsc();
                        obj14.A06 = cellInfoGsm.getCellSignalStrength().getDbm();
                        obj14.A00 = cellIdentity2.getArfcn();
                        obj11.A02 = obj14;
                    } else if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        ?? obj15 = new Object();
                        CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                        obj15.A00 = cellIdentity3.getCi();
                        obj15.A02 = cellIdentity3.getMcc();
                        obj15.A03 = cellIdentity3.getMnc();
                        obj15.A04 = cellIdentity3.getPci();
                        obj15.A07 = cellIdentity3.getTac();
                        obj15.A05 = cellInfoLte.getCellSignalStrength().getDbm();
                        obj15.A06 = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                        obj15.A01 = cellIdentity3.getEarfcn();
                        obj11.A03 = obj15;
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        ?? obj16 = new Object();
                        CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                        obj16.A00 = cellIdentity4.getCid();
                        obj16.A01 = cellIdentity4.getLac();
                        obj16.A02 = cellIdentity4.getMcc();
                        obj16.A03 = cellIdentity4.getMnc();
                        obj16.A04 = cellIdentity4.getPsc();
                        obj16.A05 = cellInfoWcdma.getCellSignalStrength().getDbm();
                        obj16.A06 = cellIdentity4.getUarfcn();
                        obj11.A04 = obj16;
                    }
                    obj3.A05.add(obj11);
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            ?? obj17 = new Object();
            obj17.A00 = list2;
            ?? obj18 = new Object();
            obj18.A00 = obj17;
            c201168uy = obj18;
        }
        ?? obj19 = new Object();
        obj19.A00 = arrayList;
        Integer num4 = C05F.A00;
        ?? abstractC127695pt = new AbstractC127695pt();
        if (str != null) {
            abstractC127695pt.A00 = str;
        }
        abstractC127695pt.A06 = num4;
        abstractC127695pt.A09 = str2;
        abstractC127695pt.A0A = str3;
        abstractC127695pt.A03 = obj19;
        abstractC127695pt.A04 = obj;
        abstractC127695pt.A02 = obj2;
        abstractC127695pt.A00 = obj3;
        abstractC127695pt.A0B = str4;
        abstractC127695pt.A08 = str5;
        abstractC127695pt.A07 = num;
        abstractC127695pt.A05 = bool;
        abstractC127695pt.A01 = c201168uy;
        return abstractC127695pt;
    }
}
