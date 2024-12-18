package X;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.3qA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84613qA {
    public AbstractC12990ll A00;
    public HashMap A01;
    public HashMap A02;

    public static C84613qA A00(final AbstractC12990ll abstractC12990ll) {
        return (C84613qA) abstractC12990ll.A01(C84613qA.class, new InterfaceC16820sZ() { // from class: X.3qB
            /* JADX WARN: Type inference failed for: r4v0, types: [X.3qA, java.lang.Object] */
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                AbstractC12990ll abstractC12990ll2 = AbstractC12990ll.this;
                ?? obj = new Object();
                obj.A00 = abstractC12990ll2;
                obj.A01 = new HashMap();
                obj.A02 = new HashMap();
                C18720vz c18720vz = AbstractC12960li.A00;
                String string = AbstractC19730y1.A00(c18720vz).A00.getString("deferred_account_data", "");
                C14360o3.A0A(string);
                String string2 = AbstractC19730y1.A00(c18720vz).A00.getString("deferred_recovered_account_data", "");
                C14360o3.A0A(string2);
                try {
                    if (!TextUtils.isEmpty(string)) {
                        ImmutableList copyOf = ImmutableList.copyOf((Collection) AbstractC31209Dns.parseFromJson(C16V.A00(string)).A00);
                        C14360o3.A07(copyOf);
                        C84613qA.A01(obj, copyOf);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        Iterator<E> it = ImmutableList.copyOf((Collection) F9S.parseFromJson(C16V.A00(string2)).A00).iterator();
                        while (it.hasNext()) {
                            C34561FKv c34561FKv = (C34561FKv) it.next();
                            obj.A02.put(c34561FKv.A00.getId(), c34561FKv);
                        }
                    }
                } catch (IOException e) {
                    C0w9.A03("DeferredAccountHelper", AnonymousClass001.A0R("Malformed cached deferred accounts. Error:", e.getMessage()));
                }
                return obj;
            }
        });
    }

    public final HashSet A02() {
        HashSet hashSet = new HashSet();
        HashMap hashMap = this.A01;
        if (hashMap != null) {
            hashSet.addAll(hashMap.keySet());
        }
        HashMap hashMap2 = this.A02;
        if (hashMap2 != null) {
            hashSet.addAll(hashMap2.keySet());
        }
        return hashSet;
    }

    public final void A03() {
        C2049995m A01 = C2049995m.A01(this.A00);
        HashSet hashSet = new HashSet();
        Iterator it = A01.A02.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((AccountFamily) it.next()).A03.iterator();
            while (it2.hasNext()) {
                hashSet.add(((User) it2.next()).getId());
            }
        }
        Iterator it3 = this.A01.entrySet().iterator();
        boolean z = false;
        while (it3.hasNext()) {
            if (!hashSet.contains(((FK7) ((Map.Entry) it3.next()).getValue()).A00.A01.getId())) {
                it3.remove();
                z = true;
            }
        }
        if (z) {
            A04(this.A01.values());
        }
    }

    public final void A05(Collection collection) {
        if (collection != null) {
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C34561FKv c34561FKv = (C34561FKv) it.next();
                    this.A02.put(c34561FKv.A00.getId(), c34561FKv);
                }
                LinkedList<C34561FKv> linkedList = new LinkedList(this.A02.values());
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0d();
                C16V.A03(A0A, "account_list");
                for (C34561FKv c34561FKv2 : linkedList) {
                    if (c34561FKv2 != null) {
                        A0A.A0d();
                        String str = c34561FKv2.A01;
                        if (str != null) {
                            A0A.A0S("one_tap_nonce", str);
                        }
                        if (c34561FKv2.A00 != null) {
                            A0A.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                            User user = c34561FKv2.A00;
                            Parcelable.Creator creator = User.CREATOR;
                            AbstractC38851rI.A08(A0A, user);
                        }
                        A0A.A0T(AbstractC111324zv.A00(2623), c34561FKv2.A02);
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
                A0A.A0a();
                A0A.close();
                String obj = stringWriter.toString();
                C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
                C14360o3.A0B(obj, 0);
                InterfaceC19610xo ARD = A00.A00.ARD();
                ARD.E7K("deferred_recovered_account_data", obj);
                ARD.apply();
            } catch (IOException e) {
                C0w9.A03("DeferredAccountHelper", AnonymousClass001.A0R("Unable to save deferred accounts. Error: ", e.getMessage()));
            }
        }
    }

    public static void A01(C84613qA c84613qA, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            FK7 fk7 = (FK7) it.next();
            if (c84613qA.A02.remove(fk7.A00.A01.getId()) != null) {
                c84613qA.A05(c84613qA.A02.values());
            }
            c84613qA.A01.put(fk7.A00.A01.getId(), fk7);
        }
    }

    public final void A04(Collection collection) {
        try {
            A01(this, collection);
            LinkedList<FK7> linkedList = new LinkedList(this.A01.values());
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            C16V.A03(A0A, "account_list");
            for (FK7 fk7 : linkedList) {
                if (fk7 != null) {
                    A0A.A0d();
                    String str = fk7.A01;
                    if (str != null) {
                        A0A.A0S(AbstractC111324zv.A00(1088), str);
                    }
                    String str2 = fk7.A02;
                    if (str2 != null) {
                        A0A.A0S("one_tap_nonce", str2);
                    }
                    if (fk7.A00 != null) {
                        A0A.A0r(AbstractC111324zv.A00(3278));
                        FIE fie = fk7.A00;
                        A0A.A0d();
                        if (fie.A01 != null) {
                            A0A.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                            User user = fie.A01;
                            Parcelable.Creator creator = User.CREATOR;
                            AbstractC38851rI.A08(A0A, user);
                        }
                        A0A.A0R("link_time", fie.A00);
                        A0A.A0a();
                    }
                    A0A.A0a();
                }
            }
            A0A.A0Z();
            A0A.A0a();
            A0A.close();
            String obj = stringWriter.toString();
            C19740y2 A00 = AbstractC19730y1.A00(AbstractC12960li.A00);
            C14360o3.A0B(obj, 0);
            InterfaceC19610xo ARD = A00.A00.ARD();
            ARD.E7K("deferred_account_data", obj);
            ARD.apply();
        } catch (IOException e) {
            C0w9.A03("DeferredAccountHelper", AnonymousClass001.A0R("Unable to save deferred accounts. Error: ", e.getMessage()));
        }
    }
}
