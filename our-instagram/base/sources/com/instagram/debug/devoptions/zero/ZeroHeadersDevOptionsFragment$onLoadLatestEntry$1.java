package com.instagram.debug.devoptions.zero;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC50523MSb;
import X.AbstractC54920OQv;
import X.C00O;
import X.C0eB;
import X.C12L;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C69487VoA;
import X.C69797Vvh;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.content.DialogInterface;
import com.instagram.zero.headers.IGZeroHeadersStorage;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import libraries.zero.headers.ZeroHeadersEntry;

@DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1(ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = zeroHeadersDevOptionsFragment;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
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
            obj = iGZeroHeadersStorage.A06(this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        final String[] strArr = (String[]) ((Collection) obj).toArray(new String[0]);
        C69797Vvh c69797Vvh = new C69797Vvh(this.this$0.requireContext());
        c69797Vvh.A08("Choose Storage");
        final ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment = this.this$0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1.1

            @DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$1$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes9.dex */
            public final class C00091 extends AbstractC23611Dp implements InterfaceC16620sF {
                public final /* synthetic */ String[] $usages;
                public final /* synthetic */ int $which;
                public int label;
                public final /* synthetic */ ZeroHeadersDevOptionsFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00091(ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment, String[] strArr, int i, InterfaceC23621Ds interfaceC23621Ds) {
                    super(2, interfaceC23621Ds);
                    this.this$0 = zeroHeadersDevOptionsFragment;
                    this.$usages = strArr;
                    this.$which = i;
                }

                @Override // X.C1Dr
                public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
                    return new C00091(this.this$0, this.$usages, this.$which, interfaceC23621Ds);
                }

                @Override // X.InterfaceC16620sF
                public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
                    return ((C00091) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
                }

                @Override // X.C1Dr
                public final Object invokeSuspend(Object obj) {
                    String turnEntryToString;
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
                        String str = this.$usages[this.$which];
                        this.label = 1;
                        obj = AbstractC54920OQv.A00(iGZeroHeadersStorage, str, null, this);
                        if (obj == c1jx) {
                            return c1jx;
                        }
                    }
                    C69797Vvh c69797Vvh = new C69797Vvh(this.this$0.requireContext());
                    turnEntryToString = this.this$0.turnEntryToString((ZeroHeadersEntry) obj);
                    c69797Vvh.A01.A0C = turnEntryToString;
                    AbstractC50523MSb.A0p(c69797Vvh);
                    return C0eB.A00;
                }
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                ZeroHeadersDevOptionsFragment zeroHeadersDevOptionsFragment2 = ZeroHeadersDevOptionsFragment.this;
                C19L c19l = zeroHeadersDevOptionsFragment2.scope;
                if (c19l == null) {
                    C14360o3.A0F("scope");
                    throw C00O.createAndThrow();
                }
                AbstractC23641Du.A05(C12L.A00.A04, new C00091(zeroHeadersDevOptionsFragment2, strArr, i2, null), c19l);
            }
        };
        C69487VoA c69487VoA = c69797Vvh.A01;
        c69487VoA.A0J = strArr;
        c69487VoA.A03 = onClickListener;
        AbstractC50523MSb.A0p(c69797Vvh);
        return C0eB.A00;
    }
}
