package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.google.common.collect.ArrayListMultimap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.5e8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5e8 {
    public L1Y A00;
    public final C46g A01;
    public final C121125e6 A02;
    public final UserSession A03;
    public final InterfaceC14020nS A04;
    public final InterfaceC19630xq A05;
    public final ArrayList A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;

    public static final void A00(C5e8 c5e8, C124055jK c124055jK) {
        String message;
        String str;
        try {
            InterfaceC19610xo ARD = c5e8.A05.ARD();
            ARD.AHW();
            for (User user : c5e8.A0A.values()) {
                C14360o3.A0A(user);
                ARD.E7K(AnonymousClass001.A0R("user:", user.getId()), AbstractC225717y.A00(user));
            }
            for (C121375ed c121375ed : c5e8.A08.values()) {
                if (c121375ed != null) {
                    ARD.E7K(AnonymousClass001.A0R("thread:", c121375ed.A09), AbstractC121365ec.A00(c121375ed));
                }
            }
            for (C121395ef c121395ef : c5e8.A07.values()) {
                String A0R = AnonymousClass001.A0R("ranking_store:", c121395ef.A03);
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0d();
                String str2 = c121395ef.A03;
                if (str2 != null) {
                    A0A.A0S("view_name", str2);
                }
                A0A.A0R("expiration_ms", c121395ef.A00);
                A0A.A0r("score_map");
                A0A.A0d();
                for (Map.Entry entry : c121395ef.A04.entrySet()) {
                    if (!C16V.A04(A0A, entry)) {
                        C121415eh c121415eh = (C121415eh) entry.getValue();
                        A0A.A0d();
                        A0A.A0O("score", c121415eh.A00);
                        String str3 = c121415eh.A01;
                        if (str3 != null) {
                            A0A.A0S("entity_type", str3);
                        }
                        A0A.A0a();
                    }
                }
                A0A.A0a();
                String str4 = c121395ef.A02;
                if (str4 != null) {
                    A0A.A0S("ranking_request_id", str4);
                }
                A0A.A0R("expiration_timestamp", c121395ef.A01);
                A0A.A0a();
                A0A.close();
                ARD.E7K(A0R, stringWriter.toString());
            }
            ARD.apply();
            message = null;
        } catch (IOException e) {
            message = e.getMessage();
            C0w9.A06("BanyanCache", "Unable to save to disk", e);
        }
        if (c124055jK != null) {
            C121325eV A00 = AbstractC121315eU.A00(c124055jK.A01.A0I);
            String str5 = c124055jK.A00;
            C121335eW c121335eW = A00.A00;
            if (c121335eW != null) {
                C006802i c006802i = C006802i.A0p;
                if (message != null) {
                    c121335eW.A02.add(message);
                }
                List list = c121335eW.A00;
                list.remove(str5);
                MarkerEditor withMarker = c006802i.withMarker(135806945);
                if (str5.equals("GraphQL")) {
                    str = "disk_persist_gql_end";
                } else if (str5.equals("banyan")) {
                    str = "disk_persist_banyan_end";
                } else {
                    str = "";
                }
                PointEditor pointEditor = withMarker.pointEditor(str);
                boolean z = true;
                boolean z2 = false;
                if (message == null) {
                    z2 = true;
                }
                pointEditor.addPointData("is_successful", z2).addPointData("error_descriptions", message).markerEditingCompleted();
                if (!c121335eW.A03 && !c121335eW.A04 && list.isEmpty()) {
                    if (message != null) {
                        z = false;
                    }
                    A00.A03(z);
                }
            }
        }
    }

    public static final void A01(C5e8 c5e8, C121375ed c121375ed) {
        c5e8.A02.A00();
        User user = (User) AbstractC001800i.A0N(c121375ed.A0B);
        if (user != null && c121375ed.A0C) {
            c5e8.A09.put(user.getId(), c121375ed);
        }
    }

    public final C121395ef A02(String str) {
        this.A02.A00();
        return (C121395ef) this.A07.get(str);
    }

    public final void A03(C122045fw c122045fw) {
        this.A02.A00();
        for (C121395ef c121395ef : c122045fw.A03) {
            if (!AbstractC001800i.A0u(c122045fw.A04, c121395ef.A03)) {
                c121395ef.A01 = System.currentTimeMillis() + c121395ef.A00;
            }
            this.A07.put(c121395ef.A03, c121395ef);
        }
        C126275nO c126275nO = c122045fw.A00;
        if (c126275nO != null) {
            List<User> unmodifiableList = Collections.unmodifiableList(c126275nO.A01);
            C14360o3.A07(unmodifiableList);
            for (User user : unmodifiableList) {
                this.A0A.put(user.getId(), user);
                C46g c46g = this.A01;
                String fullName = user.getFullName();
                if (fullName == null) {
                    fullName = "";
                }
                c46g.E6z(AnonymousClass001.A0T(fullName, user.getUsername(), ' '), user.getId());
            }
            List<C121375ed> unmodifiableList2 = Collections.unmodifiableList(c126275nO.A00);
            C14360o3.A07(unmodifiableList2);
            for (C121375ed c121375ed : unmodifiableList2) {
                this.A08.put(c121375ed.A09, c121375ed);
                A01(this, c121375ed);
            }
        }
    }

    public final void A04(boolean z) {
        try {
            C121125e6 c121125e6 = this.A02;
            ReentrantReadWriteLock reentrantReadWriteLock = c121125e6.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                try {
                    c121125e6.A00();
                    this.A07.clear();
                    this.A0A.clear();
                    this.A08.clear();
                    this.A01.clear();
                    L1Y l1y = this.A00;
                    if (l1y != null) {
                        Object value = l1y.A01.getValue();
                        C14360o3.A07(value);
                        ((C41761wQ) value).A01();
                    }
                    if (z) {
                        InterfaceC19610xo ARD = this.A05.ARD();
                        ARD.AHW();
                        ARD.apply();
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            C0K8.A0F("BanyanCache", "Unable to acquire lock for executing this block.", e);
        }
    }

    public C5e8(C121125e6 c121125e6, UserSession userSession) {
        Map map;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323345876397240L)) {
            map = AbstractC121145e9.A01;
        } else {
            map = AbstractC121145e9.A00;
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        this.A06 = arrayList;
        this.A07 = new HashMap();
        this.A08 = new HashMap();
        this.A09 = new HashMap();
        this.A0A = new HashMap();
        this.A01 = new ArrayListMultimap();
        this.A05 = C1AT.A01(userSession).A03(C1AV.A0U);
        this.A02 = c121125e6;
        this.A0C = new AtomicBoolean();
        this.A0B = new AtomicBoolean();
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A04 = A00;
        if (!C18U.A06(c06090Tz, userSession, 36317908449367734L)) {
            arrayList.remove("direct_ibc_inbox_discovery");
        }
        if (!C18U.A06(c06090Tz, userSession, 36317908449171123L)) {
            arrayList.remove("direct_ibc_inbox_invitations");
        }
        if (C18U.A06(c06090Tz, userSession, 36324290768941130L)) {
            arrayList.remove("forwarding_recipient_sheet");
            arrayList.remove("story_share_sheet");
        }
        arrayList.remove("direct_ibc_inbox_discovery_nullstate");
        this.A03 = userSession;
    }
}
