package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2kS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57532kS extends AbstractC57542kT {
    public C25301Lk A00;
    public Map A01;
    public final UserSession A02;

    public static synchronized C57532kS A00(UserSession userSession) {
        C57532kS c57532kS;
        synchronized (C57532kS.class) {
            C57502kP A00 = AbstractC57492kO.A00(userSession);
            c57532kS = (C57532kS) ((AbstractC57542kT) A00.A04.get(C57532kS.class));
            if (c57532kS == null) {
                c57532kS = new C57532kS(new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2kU
                    @Override // X.InterfaceC25281Li
                    public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                        C87393v1 c87393v1 = (C87393v1) obj;
                        StringWriter stringWriter = new StringWriter();
                        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                        A0A.A0d();
                        if (c87393v1.A00 != null) {
                            C16V.A03(A0A, AbstractC111324zv.A00(2865));
                            for (FO4 fo4 : c87393v1.A00) {
                                if (fo4 != null) {
                                    A0A.A0d();
                                    A0A.A0R("creation_time", fo4.A00);
                                    String str = fo4.A03;
                                    if (str != null) {
                                        A0A.A0S("media_id", str);
                                    }
                                    String str2 = fo4.A02;
                                    if (str2 != null) {
                                        A0A.A0S(AbstractC111324zv.A00(2662), str2);
                                    }
                                    A0A.A0T(AbstractC111324zv.A00(2604), fo4.A07);
                                    String str3 = fo4.A01;
                                    if (str3 != null) {
                                        A0A.A0S(AbstractC111324zv.A00(3876), str3);
                                    }
                                    if (fo4.A05 != null) {
                                        C16V.A03(A0A, AbstractC111324zv.A00(2726));
                                        for (String str4 : fo4.A05) {
                                            if (str4 != null) {
                                                A0A.A0u(str4);
                                            }
                                        }
                                        A0A.A0Z();
                                    }
                                    String str5 = fo4.A04;
                                    if (str5 != null) {
                                        A0A.A0S("radio_type", str5);
                                    }
                                    A0A.A0a();
                                }
                            }
                            A0A.A0Z();
                        }
                        A0A.A0a();
                        A0A.close();
                        return stringWriter.toString();
                    }

                    @Override // X.InterfaceC25281Li
                    public final /* bridge */ /* synthetic */ Object E3T(String str) {
                        return AbstractC34316FBk.parseFromJson(C16V.A00(str));
                    }
                }, 1474091397), userSession);
                A00.A03(c57532kS, C57532kS.class);
            }
        }
        return c57532kS;
    }

    @Override // X.AbstractC57542kT
    public final void A0K() {
        List<FO4> list;
        C25301Lk c25301Lk = this.A00;
        UserSession userSession = this.A02;
        C87393v1 c87393v1 = (C87393v1) c25301Lk.A02(AnonymousClass001.A0R("pending_likes_", userSession.userId), true);
        c25301Lk.A04(AnonymousClass001.A0R("pending_likes_", userSession.userId));
        if (c87393v1 != null && (list = c87393v1.A00) != null) {
            HashMap hashMap = new HashMap();
            for (FO4 fo4 : list) {
                String str = fo4.A03;
                fo4.A06 = true;
                hashMap.put(str, fo4);
            }
            A0I(hashMap);
            A0C();
            hashMap.size();
        }
    }

    public final EnumC77173d3 A0L(C38321qM c38321qM) {
        EnumC77173d3 enumC77173d3;
        if (super.A00 == null) {
            A0B();
        }
        if (A0J(c38321qM.getId())) {
            Object A05 = A05(c38321qM.getId());
            A05.getClass();
            if (((FO4) A05).A02.equals("like")) {
                enumC77173d3 = EnumC77173d3.A02;
            } else {
                enumC77173d3 = EnumC77173d3.A03;
            }
        } else {
            enumC77173d3 = (EnumC77173d3) this.A01.get(c38321qM.getId());
            if (enumC77173d3 == null) {
                return c38321qM.A1c();
            }
        }
        if (c38321qM.A1c() != enumC77173d3 && C11T.A08()) {
            I0H.A00(this.A02, c38321qM.A1c(), enumC77173d3, c38321qM);
        }
        return enumC77173d3;
    }

    public C57532kS(C25301Lk c25301Lk, UserSession userSession) {
        super(userSession);
        this.A01 = new LinkedHashMap<String, EnumC77173d3>() { // from class: X.2kV
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, EnumC77173d3> entry) {
                if (size() <= 10) {
                    return false;
                }
                return true;
            }
        };
        this.A02 = userSession;
        this.A00 = c25301Lk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.FO4] */
    public final FO4 A0M(InterfaceC11380iw interfaceC11380iw, EnumC77173d3 enumC77173d3, C38321qM c38321qM, String str, Map map, boolean z) {
        String str2;
        c38321qM.getId();
        String id = c38321qM.getId();
        if (enumC77173d3 == EnumC77173d3.A02) {
            str2 = "like";
        } else {
            str2 = "unlike";
        }
        String moduleName = interfaceC11380iw.getModuleName();
        ?? obj = new Object();
        obj.A06 = false;
        obj.A00 = RealtimeSinceBootClock.A00.now();
        obj.A03 = id;
        obj.A02 = str2;
        obj.A07 = z;
        obj.A01 = moduleName;
        if (map != null) {
            obj.A05 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    obj.A05.add(entry.getKey());
                    obj.A05.add(entry.getValue());
                }
            }
        }
        obj.A04 = str;
        A0H(c38321qM.getId(), obj);
        return obj;
    }

    public final boolean A0N(C38321qM c38321qM) {
        if (A0L(c38321qM) != EnumC77173d3.A02) {
            return false;
        }
        return true;
    }
}
