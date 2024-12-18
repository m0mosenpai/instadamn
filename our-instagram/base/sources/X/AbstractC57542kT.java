package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* renamed from: X.2kT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC57542kT {
    public Context A00;
    public InterfaceC14020nS A01;
    public final UserSession A02;
    public final LinkedHashMap A04 = new LinkedHashMap();
    public final Map A05 = new HashMap();
    public final Object A03 = new Object();

    public final synchronized void A0B() {
        if (this.A00 == null) {
            this.A00 = AbstractC12290kX.A00;
            this.A01 = AbstractC57492kO.A00(this.A02).A02;
            A0K();
        }
    }

    public final synchronized void A0C() {
        boolean z;
        C1ON A03;
        A02();
        Iterator it = A06().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object A05 = A05(str);
            if (A05 != null) {
                synchronized (this.A03) {
                    LinkedHashMap linkedHashMap = this.A04;
                    if (!linkedHashMap.containsKey(str)) {
                        z = false;
                    } else {
                        this.A05.put(str, linkedHashMap.remove(str));
                        z = true;
                    }
                }
                if (z && (A03 = A03(A05)) != null) {
                    A03.A00 = new NA4(this, A04(), A05, str);
                    AbstractC57492kO.A00(this.A02).A02(A03);
                }
            }
        }
    }

    public final synchronized void A0D(Context context, InterfaceC14020nS interfaceC14020nS) {
        A0E(context, interfaceC14020nS, 4);
    }

    public final synchronized void A0E(Context context, InterfaceC14020nS interfaceC14020nS, final int i) {
        if (this.A00 == null) {
            this.A00 = context.getApplicationContext();
            this.A01 = interfaceC14020nS;
            interfaceC14020nS.ATO(new AbstractRunnableC14200nk(i) { // from class: X.2kW
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC57542kT.this.A0K();
                }
            });
        }
    }

    public final int A02() {
        int size;
        synchronized (this.A03) {
            size = this.A04.size() + this.A05.size();
        }
        return size;
    }

    public C1ON A03(Object obj) {
        String str;
        String str2;
        if (this instanceof C57852ky) {
            C54785OJb c54785OJb = (C54785OJb) obj;
            C14360o3.A0B(c54785OJb, 0);
            return c54785OJb.A00(((C57852ky) this).A01);
        }
        if (this instanceof C57532kS) {
            FO4 fo4 = (FO4) obj;
            C25621Ms c25621Ms = new C25621Ms(((C57532kS) this).A02);
            c25621Ms.A09(C05F.A01);
            c25621Ms.A0L("media/%s/%s/", fo4.A03, fo4.A02);
            if (fo4.A07) {
                str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str2 = "0";
            }
            c25621Ms.A9s("d", str2);
            c25621Ms.A9s("media_id", fo4.A03);
            c25621Ms.A0I("is_offline_request", fo4.A06);
            c25621Ms.A9s("module_name", fo4.A01);
            List list = fo4.A05;
            if (list != null) {
                for (int i = 0; i < list.size(); i += 2) {
                    c25621Ms.A9s((String) list.get(i), (String) list.get(i + 1));
                }
            }
            String str3 = fo4.A04;
            if (str3 != null) {
                c25621Ms.A9s("radio_type", str3);
            }
            c25621Ms.A0S(C40781ul.class, C55702hA.class);
            c25621Ms.A0M("d");
            return c25621Ms.A0N();
        }
        if (this instanceof C57602kZ) {
            C41151IJq c41151IJq = (C41151IJq) obj;
            C25621Ms c25621Ms2 = new C25621Ms(((C57602kZ) this).A02);
            c25621Ms2.A09(C05F.A01);
            Integer num = c41151IJq.A01;
            if (num == null) {
                num = C05F.A00;
            }
            String str4 = c41151IJq.A04;
            String str5 = c41151IJq.A03;
            C14360o3.A0B(str4, 0);
            C14360o3.A0B(str5, 1);
            switch (num.intValue()) {
                case 1:
                    str = AbstractC111324zv.A00(3034);
                    break;
                case 2:
                    str = "save/location/%s/%s/";
                    break;
                case 3:
                    str = "creatives/effect/%s/%s/";
                    break;
                default:
                    str = "media/%s/%s/";
                    break;
            }
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, str4, str5);
            C14360o3.A07(formatStrLocaleSafe);
            c25621Ms2.A0B(formatStrLocaleSafe);
            c25621Ms2.A0S(C40781ul.class, C55702hA.class);
            String str6 = c41151IJq.A02;
            if (str6 != null) {
                c25621Ms2.A9s("radio_type", str6);
            }
            HashMap hashMap = c41151IJq.A05;
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    c25621Ms2.A9s((String) entry.getKey(), (String) entry.getValue());
                }
            }
            c25621Ms2.A0R = true;
            return c25621Ms2.A0N();
        }
        if (this instanceof C57582kX) {
            C104024mO c104024mO = (C104024mO) obj;
            C25621Ms c25621Ms3 = new C25621Ms(this.A02);
            c25621Ms3.A09(C05F.A01);
            boolean z = false;
            c25621Ms3.A0L(AbstractC111324zv.A00(416), c104024mO.A02, c104024mO.A03);
            c25621Ms3.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c104024mO.A03);
            c25621Ms3.A9s("radio_type", c104024mO.A01);
            if (c104024mO.A05 || c104024mO.A04) {
                z = true;
            }
            c25621Ms3.A0I("is_offline_request", z);
            c25621Ms3.A0S(C40781ul.class, C55702hA.class);
            c25621Ms3.A0R = true;
            return c25621Ms3.A0N();
        }
        if (this instanceof C57682kh) {
            OW1 ow1 = (OW1) obj;
            if (this.A00 == null) {
                A0B();
            }
            UserSession userSession = this.A02;
            C84923qg A00 = ow1.A00();
            String str7 = ow1.A05;
            String str8 = ow1.A06;
            return AbstractC55152OdF.A00(userSession, A00, ow1.A00().A07, str7, str8, ow1.A01, ow1.A00, ow1.A02, ow1.A07, ow1.A09, ow1.A0A, ow1.A08);
        }
        if (this instanceof C57822kv) {
            INM inm = (INM) obj;
            C14360o3.A0B(inm, 0);
            UserSession userSession2 = this.A02;
            C14360o3.A06(userSession2);
            return inm.A00(userSession2);
        }
        if (this instanceof C57722kl) {
            return I5Y.A00(this.A02, (C41160IJz) obj);
        }
        if (this instanceof C57652ke) {
            return ((C64022vN) obj).A03(this.A02);
        }
        if (this instanceof C57702kj) {
            return I5U.A00(this.A02, (C41159IJy) obj);
        }
        if (this instanceof C57742kn) {
            return FAY.A00(this.A02, (FLC) obj);
        }
        if (this instanceof C57762kp) {
            UserSession userSession3 = this.A02;
            JSONArray jSONArray = new JSONArray((Collection) ((C34465FHd) obj).A00);
            C25621Ms c25621Ms4 = new C25621Ms(userSession3);
            c25621Ms4.A05();
            c25621Ms4.A0B("discover/add_interested_signals/");
            c25621Ms4.A9s("media_ids", jSONArray.toString());
            c25621Ms4.A0S(C40781ul.class, C55702hA.class);
            return c25621Ms4.A0N();
        }
        return ((C57802kt) obj).A01(this.A02);
    }

    public Integer A04() {
        if (!(this instanceof C57852ky) && !(this instanceof C57532kS) && !(this instanceof C57602kZ) && !(this instanceof C57582kX) && !(this instanceof C57682kh) && !(this instanceof C57822kv) && !(this instanceof C57722kl)) {
            if (this instanceof C57652ke) {
                return C05F.A0N;
            }
            if (!(this instanceof C57702kj) && !(this instanceof C57742kn) && !(this instanceof C57762kp)) {
                return C05F.A0C;
            }
        }
        return C05F.A01;
    }

    public final Object A05(String str) {
        Object obj;
        synchronized (this.A03) {
            LinkedHashMap linkedHashMap = this.A04;
            if (linkedHashMap.containsKey(str)) {
                obj = linkedHashMap.get(str);
            } else {
                obj = this.A05.get(str);
            }
        }
        return obj;
    }

    public final ArrayList A06() {
        ArrayList arrayList;
        synchronized (this.A03) {
            arrayList = new ArrayList(this.A04.keySet());
        }
        return arrayList;
    }

    public final ArrayList A07() {
        ArrayList arrayList;
        synchronized (this.A03) {
            arrayList = new ArrayList(this.A04.values());
        }
        return arrayList;
    }

    public final HashMap A08() {
        HashMap hashMap;
        synchronized (this.A03) {
            hashMap = new HashMap(this.A04);
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A09() {
        C25301Lk c25301Lk;
        String str;
        UserSession userSession;
        C57782kr c57782kr;
        String A0R;
        if (this instanceof C57722kl) {
            C57722kl c57722kl = (C57722kl) this;
            c25301Lk = c57722kl.A00;
            A0R = c57722kl.A01;
        } else if (this instanceof C57702kj) {
            C57702kj c57702kj = (C57702kj) this;
            c25301Lk = c57702kj.A00;
            A0R = c57702kj.A01;
        } else if (this instanceof C57742kn) {
            C57742kn c57742kn = (C57742kn) this;
            c25301Lk = c57742kn.A00;
            A0R = c57742kn.A01;
        } else {
            if (this instanceof C57602kZ) {
                C57602kZ c57602kZ = (C57602kZ) this;
                c25301Lk = c57602kZ.A00;
                str = "pending_saves_";
                userSession = c57602kZ.A02;
            } else {
                if (this instanceof C57582kX) {
                    C57582kX c57582kX = (C57582kX) this;
                    c25301Lk = c57582kX.A00;
                    str = "pending_follows_";
                    c57782kr = c57582kX;
                } else if (this instanceof C57822kv) {
                    C57822kv c57822kv = (C57822kv) this;
                    c25301Lk = c57822kv.A00;
                    str = "pending_upcoming_event_reminders_";
                    c57782kr = c57822kv;
                } else {
                    if (this instanceof C57852ky) {
                        C57852ky c57852ky = (C57852ky) this;
                        C25301Lk c25301Lk2 = c57852ky.A00;
                        String A0R2 = AnonymousClass001.A0R("pending_story_likes", c57852ky.A01.userId);
                        C11T.A05("This operation can't be run on UI thread.");
                        new C87403v2(c25301Lk2, A0R2).run();
                        return;
                    }
                    if (this instanceof C57652ke) {
                        C57652ke c57652ke = (C57652ke) this;
                        c25301Lk = c57652ke.A00;
                        str = "pending_reel_seen_states_";
                        c57782kr = c57652ke;
                    } else if (this instanceof C57532kS) {
                        C57532kS c57532kS = (C57532kS) this;
                        c25301Lk = c57532kS.A00;
                        str = "pending_likes_";
                        userSession = c57532kS.A02;
                    } else if (this instanceof C57762kp) {
                        C57762kp c57762kp = (C57762kp) this;
                        c25301Lk = c57762kp.A00;
                        str = "pending_explore_positive_signals_";
                        c57782kr = c57762kp;
                    } else if (this instanceof C57682kh) {
                        C57682kh c57682kh = (C57682kh) this;
                        c25301Lk = c57682kh.A00;
                        str = "pending_comments_";
                        c57782kr = c57682kh;
                    } else {
                        C57782kr c57782kr2 = (C57782kr) this;
                        c25301Lk = c57782kr2.A02;
                        str = "pending_clips_seen_states_";
                        c57782kr = c57782kr2;
                    }
                }
                userSession = ((AbstractC57542kT) c57782kr).A02;
            }
            A0R = AnonymousClass001.A0R(str, userSession.userId);
        }
        c25301Lk.A04(A0R);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.4JP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.4JN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, X.4JO] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, X.4Pd] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, X.4Hz] */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.4Pv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.4JM] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X.4PI] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.4CJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.43b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.3v1, java.lang.Object] */
    public void A0A() {
        String str;
        String str2;
        String str3;
        C25301Lk c25301Lk;
        Object obj;
        UserSession userSession;
        C95114Pw c95114Pw;
        C25301Lk c25301Lk2;
        C57682kh c57682kh;
        C95114Pw c95114Pw2;
        C25301Lk c25301Lk3;
        C57652ke c57652ke;
        Object obj2;
        C25301Lk c25301Lk4;
        if (this instanceof C57782kr) {
            C57782kr c57782kr = (C57782kr) this;
            ?? obj3 = new Object();
            obj3.A00 = c57782kr.A08();
            C57802kt c57802kt = new C57802kt();
            c57802kt.A02.addAll(c57782kr.A0L());
            c57802kt.A01.putAll(c57782kr.A0M());
            obj3.A00.put("cache", c57802kt);
            c57782kr.A00 = c57802kt.A00();
            str3 = "pending_clips_seen_states_";
            c25301Lk4 = c57782kr.A02;
            obj2 = obj3;
            c57652ke = c57782kr;
        } else {
            if (this instanceof C57532kS) {
                C57532kS c57532kS = (C57532kS) this;
                c57532kS.A02();
                ?? obj4 = new Object();
                obj4.A00 = c57532kS.A07();
                C25301Lk c25301Lk5 = c57532kS.A00;
                str = "pending_likes_";
                userSession = c57532kS.A02;
                c25301Lk3 = c25301Lk5;
                c95114Pw2 = obj4;
            } else {
                if (this instanceof C57582kX) {
                    C57582kX c57582kX = (C57582kX) this;
                    c57582kX.A02();
                    ?? obj5 = new Object();
                    obj5.A00 = c57582kX.A07();
                    C25301Lk c25301Lk6 = c57582kX.A00;
                    str = "pending_follows_";
                    c57682kh = c57582kX;
                    c25301Lk2 = c25301Lk6;
                    c95114Pw = obj5;
                } else if (this instanceof C57822kv) {
                    C57822kv c57822kv = (C57822kv) this;
                    ?? obj6 = new Object();
                    obj6.A00 = c57822kv.A07();
                    str3 = "pending_upcoming_event_reminders_";
                    c25301Lk4 = c57822kv.A00;
                    obj2 = obj6;
                    c57652ke = c57822kv;
                } else if (this instanceof C57852ky) {
                    C57852ky c57852ky = (C57852ky) this;
                    C95114Pw c95114Pw3 = new C95114Pw();
                    ArrayList A07 = c57852ky.A07();
                    C14360o3.A0B(A07, 0);
                    c95114Pw3.A00 = A07;
                    C25301Lk c25301Lk7 = c57852ky.A00;
                    str = "pending_story_likes";
                    userSession = c57852ky.A01;
                    c25301Lk3 = c25301Lk7;
                    c95114Pw2 = c95114Pw3;
                } else if (this instanceof C57602kZ) {
                    C57602kZ c57602kZ = (C57602kZ) this;
                    c57602kZ.A02();
                    ?? obj7 = new Object();
                    obj7.A00 = c57602kZ.A07();
                    C25301Lk c25301Lk8 = c57602kZ.A00;
                    str = "pending_saves_";
                    userSession = c57602kZ.A02;
                    c25301Lk3 = c25301Lk8;
                    c95114Pw2 = obj7;
                } else {
                    if (this instanceof C57722kl) {
                        C57722kl c57722kl = (C57722kl) this;
                        C25301Lk c25301Lk9 = c57722kl.A00;
                        str2 = c57722kl.A01;
                        ArrayList A072 = c57722kl.A07();
                        ?? obj8 = new Object();
                        obj8.A00 = A072;
                        obj = obj8;
                        c25301Lk = c25301Lk9;
                    } else if (this instanceof C57652ke) {
                        C57652ke c57652ke2 = (C57652ke) this;
                        c57652ke2.A02();
                        ?? obj9 = new Object();
                        obj9.A00 = c57652ke2.A08();
                        str3 = "pending_reel_seen_states_";
                        c25301Lk4 = c57652ke2.A00;
                        obj2 = obj9;
                        c57652ke = c57652ke2;
                    } else if (this instanceof C57702kj) {
                        C57702kj c57702kj = (C57702kj) this;
                        C25301Lk c25301Lk10 = c57702kj.A00;
                        str2 = c57702kj.A01;
                        ArrayList A073 = c57702kj.A07();
                        ?? obj10 = new Object();
                        obj10.A00 = A073;
                        obj = obj10;
                        c25301Lk = c25301Lk10;
                    } else if (this instanceof C57742kn) {
                        C57742kn c57742kn = (C57742kn) this;
                        C25301Lk c25301Lk11 = c57742kn.A00;
                        str2 = c57742kn.A01;
                        ArrayList A074 = c57742kn.A07();
                        ?? obj11 = new Object();
                        obj11.A00 = A074;
                        obj = obj11;
                        c25301Lk = c25301Lk11;
                    } else if (this instanceof C57762kp) {
                        C57762kp c57762kp = (C57762kp) this;
                        ?? obj12 = new Object();
                        obj12.A00 = c57762kp.A07();
                        C25301Lk c25301Lk12 = c57762kp.A00;
                        str = "pending_explore_positive_signals_";
                        c57682kh = c57762kp;
                        c25301Lk2 = c25301Lk12;
                        c95114Pw = obj12;
                    } else {
                        C57682kh c57682kh2 = (C57682kh) this;
                        c57682kh2.A02();
                        ?? obj13 = new Object();
                        obj13.A00 = c57682kh2.A07();
                        C25301Lk c25301Lk13 = c57682kh2.A00;
                        str = "pending_comments_";
                        c57682kh = c57682kh2;
                        c25301Lk2 = c25301Lk13;
                        c95114Pw = obj13;
                    }
                    c25301Lk.A06(str2, obj);
                    return;
                }
                userSession = c57682kh.A02;
                c25301Lk3 = c25301Lk2;
                c95114Pw2 = c95114Pw;
            }
            c25301Lk3.A06(AnonymousClass001.A0R(str, userSession.userId), c95114Pw2);
            return;
        }
        c25301Lk4.A05(AnonymousClass001.A0R(str3, c57652ke.A02.userId), obj2);
    }

    public final void A0F(String str) {
        synchronized (this.A03) {
            this.A04.remove(str);
        }
    }

    public final void A0G(String str) {
        synchronized (this.A03) {
            this.A05.remove(str);
        }
    }

    public final void A0H(String str, Object obj) {
        C57502kP A00 = AbstractC57492kO.A00(this.A02);
        if (!A00.A00) {
            A00.A00 = true;
            C18150uz.A0B.A03(A00.A03);
        }
        synchronized (this.A03) {
            this.A04.put(str, obj);
        }
    }

    public final void A0I(Map map) {
        C57502kP A00 = AbstractC57492kO.A00(this.A02);
        if (!A00.A00) {
            A00.A00 = true;
            C18150uz.A0B.A03(A00.A03);
        }
        synchronized (this.A03) {
            this.A04.putAll(map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r3.A05.containsKey(r4) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0J(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            java.util.LinkedHashMap r0 = r3.A04     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L14
            java.util.Map r0 = r3.A05     // Catch: java.lang.Throwable -> L17
            boolean r1 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L17
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC57542kT.A0J(java.lang.String):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.2kT] */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.2kl, X.2kT] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.2kn, X.2kT] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.2kj, X.2kT] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.2ky] */
    /* JADX WARN: Type inference failed for: r6v12, types: [X.2kT] */
    /* JADX WARN: Type inference failed for: r6v14, types: [X.2kT, X.2ke] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.2kT, X.2kv] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.2kT] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.2kT, X.2kp] */
    public void A0K() {
        ?? r6;
        C25301Lk c25301Lk;
        String str;
        UserSession userSession;
        AbstractMap linkedHashMap;
        List<INM> list;
        List list2;
        HashMap hashMap;
        ?? r3;
        AbstractC57542kT abstractC57542kT;
        List<OW1> list3;
        HashMap hashMap2;
        if (this instanceof C57652ke) {
            r6 = (C57652ke) this;
            c25301Lk = r6.A00;
            str = "pending_reel_seen_states_";
            userSession = r6.A02;
            C93584Hz c93584Hz = (C93584Hz) c25301Lk.A02(AnonymousClass001.A0R("pending_reel_seen_states_", userSession.userId), true);
            if (c93584Hz != null && (hashMap2 = c93584Hz.A00) != null) {
                for (String str2 : hashMap2.keySet()) {
                    Object obj = c93584Hz.A00.get(str2);
                    obj.getClass();
                    r6.A0H(str2, obj);
                }
                r6.A0C();
            }
            c25301Lk.A04(AnonymousClass001.A0R(str, userSession.userId));
        }
        if (this instanceof C57682kh) {
            C57682kh c57682kh = (C57682kh) this;
            C25301Lk c25301Lk2 = c57682kh.A00;
            UserSession userSession2 = c57682kh.A02;
            C4JM c4jm = (C4JM) c25301Lk2.A02(AnonymousClass001.A0R("pending_comments_", userSession2.userId), true);
            c25301Lk2.A04(AnonymousClass001.A0R("pending_comments_", userSession2.userId));
            if (c4jm != null && (list3 = c4jm.A00) != null) {
                HashMap hashMap3 = new HashMap();
                for (OW1 ow1 : list3) {
                    if (ow1.A00() != null) {
                        ow1.A00().A06 = EnumC84933qh.A08;
                        ow1.A08 = true;
                        hashMap3.put(ow1.A00().A0G, ow1);
                    }
                }
                c57682kh.A0I(hashMap3);
                c57682kh.A0C();
                hashMap3.size();
                return;
            }
            return;
        }
        if (this instanceof C57722kl) {
            r3 = (C57722kl) this;
            C4JO c4jo = (C4JO) r3.A00.A02(r3.A01, true);
            abstractC57542kT = r3;
            if (c4jo != null) {
                List<C41160IJz> list4 = c4jo.A00;
                abstractC57542kT = r3;
                if (list4 != null) {
                    for (C41160IJz c41160IJz : list4) {
                        String str3 = c41160IJz.A05;
                        str3.getClass();
                        r3.A0H(str3, c41160IJz);
                    }
                    r3.A0C();
                    abstractC57542kT = r3;
                }
            }
            abstractC57542kT.A09();
            return;
        }
        if (this instanceof C57702kj) {
            r3 = (C57702kj) this;
            C4JN c4jn = (C4JN) r3.A00.A02(r3.A01, true);
            abstractC57542kT = r3;
            if (c4jn != null) {
                List<C41159IJy> list5 = c4jn.A00;
                abstractC57542kT = r3;
                if (list5 != null) {
                    for (C41159IJy c41159IJy : list5) {
                        r3.A0H(C57702kj.A01(c41159IJy), c41159IJy);
                    }
                    r3.A0C();
                    abstractC57542kT = r3;
                }
            }
            abstractC57542kT.A09();
            return;
        }
        if (this instanceof C57742kn) {
            r3 = (C57742kn) this;
            C4JP c4jp = (C4JP) r3.A00.A02(r3.A01, true);
            abstractC57542kT = r3;
            if (c4jp != null) {
                List<FLC> list6 = c4jp.A00;
                abstractC57542kT = r3;
                if (list6 != null) {
                    for (FLC flc : list6) {
                        r3.A0H(flc.A01, flc);
                    }
                    r3.A0C();
                    abstractC57542kT = r3;
                }
            }
            abstractC57542kT.A09();
            return;
        }
        if (this instanceof C57782kr) {
            C57782kr c57782kr = (C57782kr) this;
            c25301Lk = c57782kr.A02;
            str = "pending_clips_seen_states_";
            userSession = ((AbstractC57542kT) c57782kr).A02;
            C94964Pd c94964Pd = (C94964Pd) c25301Lk.A01(AnonymousClass001.A0R("pending_clips_seen_states_", userSession.userId), 1000L, true);
            if (c94964Pd != null && (hashMap = c94964Pd.A00) != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    c57782kr.A01.A02.addAll(((C57802kt) entry.getValue()).A02);
                    c57782kr.A01.A01.putAll(((C57802kt) entry.getValue()).A01);
                }
            }
        } else {
            if (this instanceof C57762kp) {
                r6 = (C57762kp) this;
                c25301Lk = r6.A00;
                str = "pending_explore_positive_signals_";
                userSession = r6.A02;
                C4PI c4pi = (C4PI) c25301Lk.A02(AnonymousClass001.A0R("pending_explore_positive_signals_", userSession.userId), true);
                if (c4pi != null && (list2 = c4pi.A00) != null) {
                    linkedHashMap = new HashMap();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(UUID.randomUUID().toString(), it.next());
                    }
                    r6.A0I(linkedHashMap);
                }
            } else if (this instanceof C57822kv) {
                r6 = (C57822kv) this;
                c25301Lk = r6.A00;
                str = "pending_upcoming_event_reminders_";
                userSession = r6.A02;
                C95104Pv c95104Pv = (C95104Pv) c25301Lk.A02(AnonymousClass001.A0R("pending_upcoming_event_reminders_", userSession.userId), true);
                if (c95104Pv != null && (list = c95104Pv.A00) != null) {
                    linkedHashMap = new HashMap();
                    for (INM inm : list) {
                        linkedHashMap.put(inm.A02(), inm);
                    }
                    r6.A0I(linkedHashMap);
                }
            } else {
                r6 = (C57852ky) this;
                c25301Lk = r6.A00;
                str = "pending_story_likes";
                userSession = r6.A01;
                C95114Pw c95114Pw = (C95114Pw) c25301Lk.A02(AnonymousClass001.A0R("pending_story_likes", userSession.userId), true);
                if (c95114Pw != null) {
                    List<C54785OJb> list7 = c95114Pw.A00;
                    int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(list7, 10));
                    if (A0L < 16) {
                        A0L = 16;
                    }
                    linkedHashMap = new LinkedHashMap(A0L);
                    for (C54785OJb c54785OJb : list7) {
                        String str4 = c54785OJb.A04;
                        if (str4 != null) {
                            linkedHashMap.put(str4, c54785OJb);
                        } else {
                            C14360o3.A0F("mediaId");
                            throw C00O.createAndThrow();
                        }
                    }
                    r6.A0I(linkedHashMap);
                }
            }
            r6.A0C();
        }
        c25301Lk.A04(AnonymousClass001.A0R(str, userSession.userId));
    }

    public AbstractC57542kT(UserSession userSession) {
        this.A02 = userSession;
    }
}
