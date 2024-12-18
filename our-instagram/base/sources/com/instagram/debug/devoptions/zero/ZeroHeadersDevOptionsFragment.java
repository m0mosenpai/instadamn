package com.instagram.debug.devoptions.zero;

import X.AbstractC06930Yk;
import X.AbstractC09560e7;
import X.AbstractC16490ru;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC25227BEk;
import X.AbstractC31175DnJ;
import X.AbstractC33235ElU;
import X.AbstractC43594JPz;
import X.AbstractC50523MSb;
import X.AbstractC60492pY;
import X.AnonymousClass191;
import X.C00O;
import X.C05F;
import X.C0eB;
import X.C0f9;
import X.C12L;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C50112Sa;
import X.C55171Oda;
import X.C69797Vvh;
import X.GHY;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.OWQ;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.zero.headers.IGZeroHeadersConfigFetch;
import com.instagram.zero.headers.IGZeroHeadersPing;
import com.instagram.zero.headers.IGZeroHeadersSideEffects;
import com.instagram.zero.headers.IGZeroHeadersStorage;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import libraries.zero.headers.ZeroHeadersEntry;

/* loaded from: classes9.dex */
public final class ZeroHeadersDevOptionsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public IGZeroHeadersConfigFetch configFetch;
    public C55171Oda headersManager;
    public ArrayList items;
    public OWQ logger;
    public IGZeroHeadersPing ping;
    public C19L scope;
    public IGZeroHeadersSideEffects sideEffects;
    public IGZeroHeadersStorage storage;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final String moduleName = "ZeroHeadersDevOptionsFragment";

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "Zero Headers Settings");
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList arrayList = this.items;
        if (arrayList == null) {
            C14360o3.A0F(DialogModule.KEY_ITEMS);
            throw C00O.createAndThrow();
        }
        setItems(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadLatestEntry() {
        C19L c19l = this.scope;
        if (c19l == null) {
            C14360o3.A0F("scope");
            throw C00O.createAndThrow();
        }
        AbstractC23641Du.A05(C12L.A00.A04, new ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1(this, null), c19l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStartHeadersFlow(UserSession userSession) {
        C19L c19l = this.scope;
        if (c19l != null) {
            ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1 zeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1 = new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1(this, null);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            Integer num = C05F.A00;
            C50112Sa A01 = AbstractC23641Du.A01(num, anonymousClass191, zeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1, c19l);
            C19L c19l2 = this.scope;
            if (c19l2 != null) {
                AbstractC23641Du.A03(num, C12L.A00.A04, new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1(A01, this, null), c19l2);
                return;
            }
        }
        C14360o3.A0F("scope");
        throw C00O.createAndThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String turnEntryToString(ZeroHeadersEntry zeroHeadersEntry) {
        if (zeroHeadersEntry == null) {
            return "null";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("\n      Entry Fetched: {\n        Storage ID: ");
        A1C.append(zeroHeadersEntry.A06);
        A1C.append(",\n        Masked MSISDN: ");
        A1C.append(zeroHeadersEntry.A05);
        A1C.append(",\n        Created At: ");
        A1C.append(Instant.ofEpochSecond(zeroHeadersEntry.A00).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        A1C.append(",\n        Expires At: ");
        A1C.append(Instant.ofEpochSecond(zeroHeadersEntry.A01).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        A1C.append(",\n        Encrypted MSISDN: ");
        A1C.append(AbstractC25227BEk.A0w(zeroHeadersEntry.A03, 0, 8));
        return AbstractC16490ru.A0p(AbstractC166997dE.A0x("...,\n      }", A1C));
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.zero.headers.IGZeroHeadersPing, java.lang.Object] */
    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(168185771);
        super.onCreate(bundle);
        this.configFetch = new IGZeroHeadersConfigFetch(AbstractC166987dD.A0r(this.session$delegate));
        this.ping = new Object();
        this.storage = new IGZeroHeadersStorage(AbstractC166987dD.A0r(this.session$delegate));
        this.logger = new OWQ(AbstractC166987dD.A0r(this.session$delegate));
        IGZeroHeadersSideEffects iGZeroHeadersSideEffects = new IGZeroHeadersSideEffects(AbstractC166987dD.A0r(this.session$delegate));
        this.sideEffects = iGZeroHeadersSideEffects;
        IGZeroHeadersConfigFetch iGZeroHeadersConfigFetch = this.configFetch;
        if (iGZeroHeadersConfigFetch == null) {
            str = "configFetch";
        } else {
            IGZeroHeadersPing iGZeroHeadersPing = this.ping;
            if (iGZeroHeadersPing == null) {
                str = "ping";
            } else {
                IGZeroHeadersStorage iGZeroHeadersStorage = this.storage;
                if (iGZeroHeadersStorage == null) {
                    str = "storage";
                } else {
                    OWQ owq = this.logger;
                    if (owq == null) {
                        str = "logger";
                    } else {
                        this.headersManager = new C55171Oda(iGZeroHeadersConfigFetch, owq, iGZeroHeadersPing, iGZeroHeadersSideEffects, iGZeroHeadersStorage);
                        this.scope = AbstractC43594JPz.A13(C12L.A00, 197189788);
                        this.items = AbstractC166987dD.A1E();
                        GHY ghy = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$forceHeadersPingItem$1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int A05 = C0f9.A05(-1065894995);
                                ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment = ZeroHeadersDevOptionsFragment.this;
                                zeroHeadersDevOptionsFragment.onStartHeadersFlow(AbstractC166987dD.A0r(zeroHeadersDevOptionsFragment.session$delegate));
                                C0f9.A0C(289130580, A05);
                            }
                        }, "Force Headers Ping");
                        ArrayList arrayList = this.items;
                        if (arrayList != null) {
                            arrayList.add(ghy);
                            GHY ghy2 = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$getLatestHeadersEntry$1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int A05 = C0f9.A05(-1539543095);
                                    ZeroHeadersDevOptionsFragment.this.onLoadLatestEntry();
                                    C0f9.A0C(-223720326, A05);
                                }
                            }, "Get Latest Headers Entry");
                            ArrayList arrayList2 = this.items;
                            if (arrayList2 != null) {
                                arrayList2.add(ghy2);
                                GHY ghy3 = new GHY(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1

                                    @DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1$1, reason: invalid class name */
                                    /* loaded from: classes9.dex */
                                    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
                                        public int label;
                                        public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

                                        @DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1$1$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1$1$1, reason: invalid class name and collision with other inner class name */
                                        /* loaded from: classes9.dex */
                                        public final class C00081 extends AbstractC23611Dp implements InterfaceC16620sF {
                                            public int label;
                                            public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C00081(ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment, InterfaceC23621Ds interfaceC23621Ds) {
                                                super(2, interfaceC23621Ds);
                                                this.this$0 = zeroHeadersDevOptionsFragment;
                                            }

                                            @Override // X.C1Dr
                                            public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
                                                return new C00081(this.this$0, interfaceC23621Ds);
                                            }

                                            @Override // X.InterfaceC16620sF
                                            public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
                                                return new C00081(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
                                            }

                                            @Override // X.C1Dr
                                            public final Object invokeSuspend(Object obj) {
                                                C1JX c1jx = C1JX.A02;
                                                int i = this.label;
                                                if (i != 0) {
                                                    if (i == 1) {
                                                        AbstractC09560e7.A00(obj);
                                                    } else {
                                                        throw AbstractC166987dD.A13();
                                                    }
                                                } else {
                                                    AbstractC09560e7.A00(obj);
                                                    IGZeroHeadersStorage iGZeroHeadersStorage = this.this$0.storage;
                                                    if (iGZeroHeadersStorage == null) {
                                                        C14360o3.A0F("storage");
                                                        throw C00O.createAndThrow();
                                                    }
                                                    this.label = 1;
                                                    if (IGZeroHeadersStorage.A00(iGZeroHeadersStorage, AbstractC06930Yk.A0E(), this) == c1jx) {
                                                        return c1jx;
                                                    }
                                                }
                                                return C0eB.A00;
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment, InterfaceC23621Ds interfaceC23621Ds) {
                                            super(2, interfaceC23621Ds);
                                            this.this$0 = zeroHeadersDevOptionsFragment;
                                        }

                                        @Override // X.C1Dr
                                        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
                                            return new AnonymousClass1(this.this$0, interfaceC23621Ds);
                                        }

                                        @Override // X.InterfaceC16620sF
                                        public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
                                            return new AnonymousClass1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
                                        }

                                        @Override // X.C1Dr
                                        public final Object invokeSuspend(Object obj) {
                                            if (this.label == 0) {
                                                AbstractC09560e7.A00(obj);
                                                ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment = this.this$0;
                                                C19L c19l = zeroHeadersDevOptionsFragment.scope;
                                                if (c19l == null) {
                                                    C14360o3.A0F("scope");
                                                    throw C00O.createAndThrow();
                                                }
                                                C00081 c00081 = new C00081(zeroHeadersDevOptionsFragment, null);
                                                AbstractC23641Du.A01(C05F.A00, AnonymousClass191.A00, c00081, c19l);
                                                C69797Vvh c69797Vvh = new C69797Vvh(this.this$0.requireContext());
                                                c69797Vvh.A01.A0C = "Entries Cleared";
                                                AbstractC50523MSb.A0p(c69797Vvh);
                                                return C0eB.A00;
                                            }
                                            throw AbstractC166987dD.A13();
                                        }
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int A05 = C0f9.A05(580325226);
                                        ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment = ZeroHeadersDevOptionsFragment.this;
                                        C19L c19l = zeroHeadersDevOptionsFragment.scope;
                                        if (c19l == null) {
                                            C14360o3.A0F("scope");
                                            throw C00O.createAndThrow();
                                        }
                                        AbstractC23641Du.A05(C12L.A00.A04, new AnonymousClass1(zeroHeadersDevOptionsFragment, null), c19l);
                                        C0f9.A0C(-665879604, A05);
                                    }
                                }, "Clear Headers Storage");
                                ArrayList arrayList3 = this.items;
                                if (arrayList3 != null) {
                                    arrayList3.add(ghy3);
                                    C0f9.A09(1677614138, A02);
                                    return;
                                }
                            }
                        }
                        C14360o3.A0F(DialogModule.KEY_ITEMS);
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
