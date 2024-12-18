package X;

import android.content.Context;
import android.database.Cursor;
import android.database.StaleDataException;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes11.dex */
public final class WGO {
    public static final X96 A0a = new WUV();
    public static final X96 A0b = new WUW();
    public static final Comparator A0c = new TSE(1);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public String A08;
    public List A09;
    public Queue A0A;
    public java.util.Set A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public String A0M;
    public final Context A0N;
    public final C69451Vna A0O;
    public final C68662VZy A0P;
    public final C69541Vr5 A0Q;
    public final WUU A0R;
    public final C69737VuX A0S;
    public final X7M A0T;
    public final SKN A0U;
    public final C69758Vuv A0V;
    public final TelephonyManager A0W;
    public final SYQ A0X;
    public final C70081W1y A0Y;
    public final C68967Vf5 A0Z;
    public QFO A0J = null;
    public QFP A0K = null;
    public UM4 A0L = null;
    public long A07 = -1;

    public static void A01(Bundle bundle, WGO wgo) {
        bundle.putBoolean("full_upload", false);
        bundle.putLong("last_upload_success_time", wgo.A0V.A00());
        bundle.putLong("time_spent", System.currentTimeMillis() - wgo.A07);
        bundle.putString("ccu_session_id", wgo.A08);
        bundle.putString(CacheBehaviorLogger.SOURCE, wgo.A0M);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [X.VmS, java.lang.Object] */
    public static void A03(C69402Vmm c69402Vmm, WGO wgo) {
        String str;
        String str2 = null;
        int i = c69402Vmm.A02;
        ArrayList A00 = SZB.A00(c69402Vmm.A06);
        String str3 = wgo.A08;
        if (str3 != null) {
            str2 = str3;
        } else {
            wgo.A0V.A01();
            wgo.A0P.A00.get();
            TelephonyManager telephonyManager = wgo.A0W;
            telephonyManager.getSimCountryIso();
            telephonyManager.getNetworkCountryIso();
        }
        int i2 = c69402Vmm.A01;
        int i3 = c69402Vmm.A05;
        int i4 = c69402Vmm.A04;
        Bundle bundle = new Bundle();
        bundle.putBoolean("full_upload", false);
        bundle.putInt("batch_index", i);
        bundle.putInt("batch_size", wgo.A0O.A00);
        bundle.putInt("contacts_upload_count", i2 + i3 + i4);
        bundle.putInt("add_count", i2);
        bundle.putInt("remove_count", i4);
        bundle.putInt("update_count", i3);
        bundle.putInt("processed_contact_count", c69402Vmm.A03);
        bundle.putLong("time_spent", System.currentTimeMillis() - wgo.A07);
        bundle.putInt("num_of_retries", !c69402Vmm.A00 ? 1 : 0);
        bundle.putString("ccu_session_id", wgo.A08);
        bundle.putString("family_device_id", null);
        Iterator it = wgo.A0Q.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC71991XEe) it.next()).DaK(bundle);
        }
        C68967Vf5 c68967Vf5 = wgo.A0Z;
        WUM wum = new WUM(bundle, c69402Vmm, wgo);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = A00.iterator();
        while (it2.hasNext()) {
            C62615SIx c62615SIx = (C62615SIx) it2.next();
            if (c62615SIx != null) {
                ?? obj = new Object();
                obj.A04 = c62615SIx.A04;
                obj.A00 = c62615SIx.A00;
                obj.A02 = c62615SIx.A01;
                obj.A05 = new ArrayList();
                List<C62420SAv> list = c62615SIx.A05;
                if (list != null) {
                    for (C62420SAv c62420SAv : list) {
                        List list2 = obj.A05;
                        if (list2 != null) {
                            String str4 = c62420SAv.A00;
                            C14360o3.A07(str4);
                            list2.add(str4);
                        }
                    }
                }
                obj.A06 = new ArrayList();
                List<C62421SAw> list3 = c62615SIx.A06;
                if (list3 != null) {
                    for (C62421SAw c62421SAw : list3) {
                        List list4 = obj.A06;
                        if (list4 != null) {
                            String str5 = c62421SAw.A00;
                            C14360o3.A07(str5);
                            list4.add(str5);
                        }
                    }
                }
                obj.A01 = c62615SIx.A02;
                obj.A03 = c62615SIx.A03;
                arrayList.add(obj);
            }
        }
        Context context = c68967Vf5.A00;
        UserSession userSession = c68967Vf5.A01;
        C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
        A0c2.A0B("address_book/merge_delta/");
        A0c2.A9s(AbstractC31580Du8.A00(0, 9, 6), C16030qx.A02.A05(context));
        A0c2.A9s(AbstractC31580Du8.A00(9, 10, 3), str2);
        A0c2.A0H(CacheBehaviorLogger.SOURCE, "ccu");
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C69382VmS c69382VmS = (C69382VmS) it3.next();
                A0A.A0d();
                String str6 = c69382VmS.A04;
                if (str6 != null) {
                    A0A.A0S("record_id", str6);
                }
                String str7 = c69382VmS.A00;
                if (str7 != null) {
                    A0A.A0S("first_name", str7);
                }
                String str8 = c69382VmS.A02;
                if (str8 != null) {
                    A0A.A0S("last_name", str8);
                }
                List list5 = c69382VmS.A05;
                if (list5 != null) {
                    Iterator A0q = AbstractC37301Gc2.A0q(A0A, AbstractC111324zv.A00(2306), list5);
                    while (A0q.hasNext()) {
                        AbstractC167017dG.A1F(A0A, A0q);
                    }
                    A0A.A0Z();
                }
                List list6 = c69382VmS.A06;
                if (list6 != null) {
                    Iterator A0q2 = AbstractC37301Gc2.A0q(A0A, AbstractC58317Pt9.A00(339), list6);
                    while (A0q2.hasNext()) {
                        AbstractC167017dG.A1F(A0A, A0q2);
                    }
                    A0A.A0Z();
                }
                String str9 = c69382VmS.A01;
                if (str9 != null) {
                    A0A.A0S("hash", str9);
                }
                String str10 = c69382VmS.A03;
                if (str10 != null) {
                    A0A.A0S("modifier", str10);
                }
                A0A.A0a();
            }
            A0A.A0Z();
            A0A.close();
            str = stringWriter.toString();
        } catch (IOException unused) {
            str = "";
        }
        A0c2.A9s("contacts", str);
        A0c2.A0H("phone_id", C11830jh.A04.A01(userSession).A02(C19T.A1Y));
        A0c2.A0R(C67802Uyb.class, C69930Vxv.class);
        A0c2.A0V = true;
        C1ON A0N = A0c2.A0N();
        A0N.A00 = new C67854UzZ(wum, userSession, 4);
        C1GJ.A03(A0N);
    }

    private void A00() {
        C69758Vuv c69758Vuv = this.A0V;
        c69758Vuv.A01();
        InterfaceC08830cm interfaceC08830cm = this.A0P.A00;
        String str = (String) interfaceC08830cm.get();
        Bundle bundle = new Bundle();
        bundle.putBoolean("full_upload", false);
        bundle.putInt("total_batch_count", this.A0F);
        bundle.putInt("contacts_upload_count", this.A0I);
        bundle.putInt("add_count", this.A0E);
        bundle.putInt("remove_count", this.A0G);
        bundle.putInt("update_count", this.A0H);
        bundle.putInt("phonebook_size", this.A01);
        C69451Vna c69451Vna = this.A0O;
        bundle.putLong("max_contacts_to_upload", c69451Vna.A02);
        bundle.putLong("time_spent", System.currentTimeMillis() - this.A07);
        bundle.putInt("num_of_retries", c69451Vna.A03);
        bundle.putString("ccu_session_id", this.A08);
        bundle.putString("family_device_id", str);
        java.util.Set set = this.A0Q.A01;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC71991XEe) it.next()).DaL(bundle);
        }
        if (interfaceC08830cm.get() != null) {
            interfaceC08830cm.get();
        }
        C69737VuX c69737VuX = this.A0S;
        c69737VuX.A01("contacts_to_upload", String.valueOf(this.A0I));
        c69737VuX.A01("batch_count", String.valueOf(this.A0F));
        c69737VuX.A01("failed_batch_count", String.valueOf(this.A05));
        c69737VuX.A00("close_connection");
        c69758Vuv.A02(System.currentTimeMillis());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("full_upload", false);
        bundle2.putLong("last_upload_success_time", c69758Vuv.A00());
        bundle2.putLong("time_spent", System.currentTimeMillis() - this.A07);
        bundle2.putInt("num_of_retries", c69451Vna.A03);
        bundle2.putString("ccu_session_id", this.A08);
        bundle2.putBoolean("in_sync", true);
        bundle2.putString("family_device_id", str);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((InterfaceC71991XEe) it2.next()).D5f(bundle2);
        }
        c69737VuX.A02(true, "");
        this.A0D = false;
    }

    public static void A02(C69402Vmm c69402Vmm, WGO wgo) {
        wgo.A0B.remove(Integer.valueOf(c69402Vmm.A02));
        if (wgo.A0B.size() < wgo.A0O.A01 && !wgo.A0A.isEmpty()) {
            C69402Vmm c69402Vmm2 = (C69402Vmm) wgo.A0A.poll();
            wgo.A0B.add(Integer.valueOf(c69402Vmm2.A02));
            A03(c69402Vmm2, wgo);
        } else {
            if (!wgo.A0C || !wgo.A0B.isEmpty() || !wgo.A0A.isEmpty()) {
                return;
            }
            wgo.A00();
        }
    }

    public static void A04(WGO wgo) {
        int i;
        wgo.A0S.A00("upload_contacts");
        C69451Vna c69451Vna = wgo.A0O;
        wgo.A0B = Collections.synchronizedSet(new HashSet(c69451Vna.A01));
        wgo.A0A = new ConcurrentLinkedQueue();
        wgo.A0C = false;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = c69451Vna.A00;
            int i3 = 0;
            int i4 = 0;
            while (wgo.A0L.hasNext()) {
                try {
                    C68896Vdt c68896Vdt = (C68896Vdt) wgo.A0L.next();
                    SZB szb = (SZB) c68896Vdt.A00;
                    C69053Vgu c69053Vgu = (C69053Vgu) c68896Vdt.A01;
                    if (szb == null) {
                        szb = new SZB(AnonymousClass001.A0Q("", c69053Vgu.A01));
                        szb.A00 = C05F.A01;
                        c69053Vgu.A00 = C05F.A0C;
                        wgo.A03++;
                    } else {
                        if (c69053Vgu != null) {
                            int i5 = wgo.A01 + 1;
                            wgo.A01 = i5;
                            if (i5 > c69451Vna.A02) {
                                szb = new SZB(AnonymousClass001.A0Q("", c69053Vgu.A01));
                                szb.A00 = C05F.A01;
                                c69053Vgu.A00 = C05F.A0C;
                                wgo.A03++;
                            } else {
                                String A00 = STN.A00(szb.toString());
                                A00.getClass();
                                if (!A00.equals(c69053Vgu.A02)) {
                                    szb.A00 = C05F.A0C;
                                    long parseLong = Long.parseLong(szb.A04);
                                    String A002 = STN.A00(szb.toString());
                                    A002.getClass();
                                    c69053Vgu = new C69053Vgu(parseLong, A002);
                                    c69053Vgu.A00 = C05F.A01;
                                    wgo.A06++;
                                }
                            }
                        } else {
                            int i6 = wgo.A01 + 1;
                            wgo.A01 = i6;
                            if (i6 <= c69451Vna.A02) {
                                Integer num = C05F.A00;
                                szb.A00 = num;
                                long parseLong2 = Long.parseLong(szb.A04);
                                String A003 = STN.A00(szb.toString());
                                A003.getClass();
                                c69053Vgu = new C69053Vgu(parseLong2, A003);
                                c69053Vgu.A00 = num;
                                wgo.A00++;
                            }
                        }
                        wgo.A02++;
                    }
                    if (!C05F.A01.equals(szb.A00)) {
                        List list = wgo.A09;
                        String A004 = STN.A00(szb.toString());
                        A004.getClass();
                        list.add(A004);
                    }
                    if (szb.A00 != null) {
                        arrayList.add(szb);
                        arrayList2.add(c69053Vgu);
                        i3++;
                        if (i3 >= i2) {
                            C69402Vmm c69402Vmm = new C69402Vmm(Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2), i4, wgo.A00, wgo.A06, wgo.A03, wgo.A02);
                            if (wgo.A0B.size() < c69451Vna.A01) {
                                wgo.A0B.add(Integer.valueOf(i4));
                                A03(c69402Vmm, wgo);
                            } else {
                                wgo.A0A.add(c69402Vmm);
                            }
                            i4++;
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList();
                            wgo.A0E += wgo.A00;
                            wgo.A00 = 0;
                            wgo.A0G += wgo.A03;
                            wgo.A03 = 0;
                            wgo.A0H += wgo.A06;
                            wgo.A06 = 0;
                            i3 = 0;
                        }
                    }
                } catch (StaleDataException | IllegalArgumentException | IllegalStateException | NullPointerException unused) {
                }
            }
            if (i3 > 0) {
                i = i4;
                C69402Vmm c69402Vmm2 = new C69402Vmm(Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2), i4, wgo.A00, wgo.A06, wgo.A03, wgo.A02);
                if (wgo.A0B.size() < c69451Vna.A01) {
                    wgo.A0B.add(Integer.valueOf(i4));
                    A03(c69402Vmm2, wgo);
                } else {
                    wgo.A0A.add(c69402Vmm2);
                }
                wgo.A0E += wgo.A00;
                wgo.A0G += wgo.A03;
                wgo.A0H += wgo.A06;
                i4++;
            } else {
                i = i4;
            }
            wgo.A0F = i4;
            wgo.A0C = true;
            wgo.A0I = wgo.A0E + wgo.A0G + wgo.A0H;
            C69758Vuv c69758Vuv = wgo.A0V;
            List list2 = wgo.A09;
            Collections.sort(list2);
            String A005 = STN.A00(TextUtils.join(":", list2));
            C14360o3.A0B(A005, 0);
            String str = c69758Vuv.A01.userId;
            if (str != null) {
                InterfaceC19610xo ARD = c69758Vuv.A02.ARD();
                ARD.E7K(AnonymousClass001.A0R(str, "last_upload_client_root_hash"), A005);
                ARD.apply();
            }
            if (i3 == 0 && i == 0) {
                wgo.A00();
            }
        } finally {
            wgo.A0J.close();
            wgo.A0K.close();
        }
    }

    public static void A05(WGO wgo, C68663VZz c68663VZz, List list, int i) {
        wgo.A0S.A00("open_connection");
        C68967Vf5 c68967Vf5 = wgo.A0Z;
        WUN wun = new WUN(wgo, c68663VZz, list, i);
        C14360o3.A0B(c68663VZz, 0);
        Context context = c68967Vf5.A00;
        UserSession userSession = c68967Vf5.A01;
        String str = c68663VZz.A00;
        C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
        A0c2.A0B("address_book/get_contact_hashes/");
        A0c2.A9s(AbstractC31580Du8.A00(0, 9, 6), C16030qx.A02.A05(context));
        A0c2.A9s("address_book_hash", str);
        A0c2.A0H("phone_id", C11830jh.A04.A01(userSession).A02(C19T.A1Y));
        A0c2.A0R(C67836Uz9.class, C69929Vxu.class);
        A0c2.A0V = true;
        C1ON A0N = A0c2.A0N();
        A0N.A00 = new C67854UzZ(wun, userSession, 3);
        C1GJ.A03(A0N);
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, X.VZz] */
    public final void A06() {
        QFP qfp;
        QFO qfo;
        Cursor query;
        C69737VuX c69737VuX = this.A0S;
        c69737VuX.A00("instantiate_iterators");
        c69737VuX.A01("full_upload", String.valueOf(false));
        c69737VuX.A01("upload_source", "CCU_BACKGROUND_PING");
        this.A0D = true;
        this.A07 = System.currentTimeMillis();
        this.A0M = "CCU_BACKGROUND_PING";
        this.A08 = null;
        C68662VZy c68662VZy = this.A0P;
        Bundle bundle = new Bundle();
        bundle.putString(CacheBehaviorLogger.SOURCE, "CCU_BACKGROUND_PING");
        bundle.putBoolean("full_upload", false);
        bundle.putString("family_device_id", null);
        C69541Vr5 c69541Vr5 = this.A0Q;
        java.util.Set set = c69541Vr5.A01;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC71991XEe) it.next()).DaN(bundle);
        }
        this.A09 = new ArrayList();
        SYQ syq = this.A0X;
        this.A0J = syq.A00();
        C70081W1y c70081W1y = this.A0Y;
        try {
            query = ((Q29) c70081W1y.A01).getWritableDatabase().query(AbstractC58317Pt9.A00(257), C70081W1y.A02, null, null, null, null, "local_contact_id");
        } catch (Exception unused) {
        }
        try {
            qfp = new QFP(query);
        } catch (Exception unused2) {
            if (query != null) {
                query.close();
            }
            Bundle bundle2 = new Bundle(1);
            bundle2.putString(TraceFieldType.FailureReason, "snapshot_iterator_cursor_null");
            c70081W1y.A00.A00(bundle2);
            qfp = null;
            this.A0K = qfp;
            qfo = this.A0J;
            int i = 0;
            if (qfo == null) {
            }
            this.A0D = false;
            Bundle bundle3 = new Bundle();
            bundle3.putString(TraceFieldType.FailureReason, "create_session_get_iterator_fail");
            bundle3.putString("family_device_id", null);
            c69541Vr5.A00(bundle3);
            c69737VuX.A02(true, "Cant create iterator, os permission may be off");
        }
        this.A0K = qfp;
        qfo = this.A0J;
        int i2 = 0;
        if (qfo == null && qfp != null) {
            this.A00 = 0;
            this.A03 = 0;
            this.A06 = 0;
            this.A0E = 0;
            this.A0G = 0;
            this.A0H = 0;
            this.A0F = 0;
            this.A0I = 0;
            this.A05 = 0;
            this.A01 = 0;
            this.A02 = 0;
            C69451Vna c69451Vna = this.A0O;
            this.A04 = c69451Vna.A03;
            this.A0L = new UM4(A0a, A0b, A0c, qfo, qfp);
            String A01 = this.A0V.A01();
            ?? obj = new Object();
            obj.A00 = A01;
            c68662VZy.A00.get();
            TelephonyManager telephonyManager = this.A0W;
            telephonyManager.getSimCountryIso();
            telephonyManager.getNetworkCountryIso();
            ArrayList arrayList = new ArrayList();
            c69737VuX.A00("read_address_book");
            QFO qfo2 = this.A0J;
            if (qfo2 == null || qfo2.A00.isClosed()) {
                QFO A00 = syq.A00();
                this.A0J = A00;
                Cursor cursor = A00.A00;
                int position = cursor.getPosition();
                cursor.moveToPosition(-1);
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow(AbstractC43591JPw.A00(142));
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("contact_id");
                long j = -1;
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndexOrThrow) == 0) {
                        long j2 = cursor.getLong(columnIndexOrThrow2);
                        if (j2 != j) {
                            i2++;
                            j = j2;
                        }
                    }
                }
                cursor.moveToPosition(position);
            }
            c69737VuX.A01("contacts_count", String.valueOf(i2));
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("full_upload", false);
            bundle4.putString(CacheBehaviorLogger.SOURCE, this.A0M);
            bundle4.putInt("batch_size", c69451Vna.A00);
            bundle4.putInt("num_of_retries", this.A04);
            bundle4.putInt("contacts_upload_count", this.A0E);
            bundle4.putLong("time_spent", System.currentTimeMillis() - this.A07);
            bundle4.putInt("phonebook_size", i2);
            bundle4.putString("family_device_id", null);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((InterfaceC71991XEe) it2.next()).DoD(bundle4);
            }
            A05(this, obj, Collections.unmodifiableList(arrayList), 0);
            return;
        }
        this.A0D = false;
        Bundle bundle32 = new Bundle();
        bundle32.putString(TraceFieldType.FailureReason, "create_session_get_iterator_fail");
        bundle32.putString("family_device_id", null);
        c69541Vr5.A00(bundle32);
        c69737VuX.A02(true, "Cant create iterator, os permission may be off");
    }

    public final void A07(int i, String str, String str2, long j) {
        C1ON A00;
        C67854UzZ c67854UzZ;
        this.A0N.checkCallingOrSelfPermission("android.permission.READ_CONTACTS");
        this.A0P.A00.get();
        C68967Vf5 c68967Vf5 = this.A0Z;
        WUO wuo = new WUO(this, str2, str, i, j);
        int hashCode = str2.hashCode();
        if (hashCode != 3551) {
            if (hashCode == 109935 && str2.equals("off")) {
                Context context = c68967Vf5.A00;
                UserSession userSession = c68967Vf5.A01;
                A00 = AbstractC35238FgX.A01(context, userSession, "remote_setting_migration", true);
                c67854UzZ = new C67854UzZ(wuo, userSession, 2);
            } else {
                return;
            }
        } else {
            if (!str2.equals("on")) {
                return;
            }
            Context context2 = c68967Vf5.A00;
            UserSession userSession2 = c68967Vf5.A01;
            A00 = AbstractC35238FgX.A00(context2, userSession2, "[]", "ig_ccu_background_job", "remote_setting_migration", false, false);
            c67854UzZ = new C67854UzZ(wuo, userSession2, 1);
        }
        A00.A00 = c67854UzZ;
        C1GJ.A03(A00);
    }

    public final void A08(long j) {
        C69737VuX c69737VuX = this.A0S;
        c69737VuX.A00("check_remote_setting");
        c69737VuX.A01("upload_source", "CCU_BACKGROUND_PING");
        this.A0R.A05("background_job_new_protocol_remote_setting", "get_remote_settng", null, null);
        C68967Vf5 c68967Vf5 = this.A0Z;
        WUL wul = new WUL(this, j);
        Context context = c68967Vf5.A00;
        UserSession userSession = c68967Vf5.A01;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("address_book/get_ccu_setting/");
        A0M.A9s(AbstractC31580Du8.A00(0, 9, 6), C16030qx.A02.A05(context));
        A0M.A0H("phone_id", C11830jh.A04.A01(userSession).A02(C19T.A1Y));
        A0M.A0R(C67814Uyn.class, C69928Vxt.class);
        A0M.A0V = true;
        C1ON A0N = A0M.A0N();
        A0N.A00 = new C67854UzZ(wul, userSession, 0);
        C1GJ.A03(A0N);
    }

    public WGO(Context context, C69451Vna c69451Vna, C68662VZy c68662VZy, C69541Vr5 c69541Vr5, WUU wuu, C69737VuX c69737VuX, C69758Vuv c69758Vuv, C68967Vf5 c68967Vf5) {
        this.A0P = c68662VZy;
        this.A0N = context;
        this.A0V = c69758Vuv;
        this.A0O = c69451Vna;
        this.A0Z = c68967Vf5;
        this.A0Q = c69541Vr5;
        this.A0R = wuu;
        this.A0W = (TelephonyManager) context.getSystemService("phone");
        this.A0X = new SYQ(context, c69541Vr5);
        Q29 q29 = new Q29(context);
        this.A0T = q29;
        this.A0U = new SKN(q29);
        this.A0Y = new C70081W1y(c69541Vr5, q29);
        this.A0S = c69737VuX;
    }
}
