package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C01L;
import X.C0eM;
import X.C0f9;
import X.C14360o3;
import X.C16930sl;
import X.C31335Dq0;
import X.C35119FeM;
import X.C35246Fgf;
import X.C50676MYu;
import X.C54737OFo;
import X.EnumC53237Nga;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.JQ0;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.debug.devoptions.sandboxselector.IgServerHealth;
import com.instagram.debug.devoptions.sandboxselector.SandboxSelectorViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class SandboxViewStateConverterKt {

    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CorpnetStatus.values().length];
            try {
                iArr[CorpnetStatus.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CorpnetStatus.ON_CORPNET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CorpnetStatus.OFF_CORPNET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SandboxType.values().length];
            try {
                iArr2[SandboxType.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SandboxType.DEDICATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SandboxType.ON_DEMAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SandboxType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[IgServerHealth.Unhealthy.UnhealthyReason.values().length];
            try {
                iArr3[IgServerHealth.Unhealthy.UnhealthyReason.BAD_GATEWAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[IgServerHealth.Unhealthy.UnhealthyReason.TIMED_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[IgServerHealth.Unhealthy.UnhealthyReason.DJANGO_UNHEALTHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[IgServerHealth.Unhealthy.UnhealthyReason.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final List toAdapterItems(SandboxSelectorViewModel.ViewState viewState, Context context, InterfaceC16660sJ interfaceC16660sJ, final InterfaceC16820sZ interfaceC16820sZ, final InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(viewState, 0);
        AbstractC167027dH.A0a(1, context, interfaceC16660sJ, interfaceC16820sZ, interfaceC16820sZ2);
        C01L A1I = C0eM.A1I();
        String A0q = AbstractC166997dE.A0q(context.getResources(), 2131958368);
        A1I.add(new C54737OFo(null, null, null, null, EnumC53237Nga.A09, null, null, Integer.valueOf(R.color.igds_error_or_destructive), null, null, null, null, A0q, null, null, true, true));
        C31335Dq0.A03(A1I, toStringRes(viewState.connectionHealth.corpnetStatus));
        C35119FeM.A00(A1I, true);
        C31335Dq0.A03(A1I, 2131958357);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(viewState.sandboxes.currentSandbox.type);
        sb.append("] ");
        A1I.add(new C35246Fgf(AbstractC166997dE.A0x(viewState.sandboxes.currentSandbox.url, sb)));
        A1I.add(new C35246Fgf(toStringRes(viewState.connectionHealth.serverHealth)));
        A1I.add(new C50676MYu(context, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxViewStateConverterKt$toAdapterItems$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(618676373);
                InterfaceC16820sZ.this.invoke();
                C0f9.A0C(-591296134, A05);
            }
        }, 2131958365));
        C35119FeM.A00(A1I, true);
        A1I.addAll(toSandboxListAdapterItems(viewState.sandboxes.availableSandboxes, context, viewState.connectionHealth.corpnetStatus, interfaceC16660sJ));
        C31335Dq0.A03(A1I, 2131958359);
        A1I.add(new C50676MYu(context, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxViewStateConverterKt$toAdapterItems$1$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-939058685);
                InterfaceC16820sZ.this.invoke();
                C0f9.A0C(362760266, A05);
            }
        }, 2131958344));
        C35119FeM.A00(A1I, true);
        return C0eM.A1J(A1I);
    }

    public static final List toSandboxListAdapterItems(List list, Context context, CorpnetStatus corpnetStatus, final InterfaceC16660sJ interfaceC16660sJ) {
        C54737OFo c54737OFo;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            ((List) JQ0.A0h(((Sandbox) obj).type, linkedHashMap)).add(obj);
        }
        for (SandboxType sandboxType : SandboxType.values()) {
            List<Sandbox> list2 = (List) linkedHashMap.get(sandboxType);
            if (list2 == null) {
                list2 = C16930sl.A00;
            }
            C31335Dq0 c31335Dq0 = new C31335Dq0(toStringRes(sandboxType));
            ArrayList arrayList2 = new ArrayList();
            for (final Sandbox sandbox : list2) {
                if (!sandbox.supportsVpnless && corpnetStatus != CorpnetStatus.ON_CORPNET) {
                    c54737OFo = new C54737OFo(null, null, null, null, EnumC53237Nga.A09, null, null, Integer.valueOf(R.color.igds_error_or_destructive), null, null, null, null, AbstractC166997dE.A0q(context.getResources(), 2131958363), null, null, true, true);
                } else {
                    c54737OFo = new C54737OFo(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxViewStateConverterKt$toSandboxListAdapterItems$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int A05 = C0f9.A05(-1107423024);
                            InterfaceC16660sJ.this.invoke(sandbox);
                            C0f9.A0C(1780275864, A05);
                        }
                    }, null, null, null, EnumC53237Nga.A09, null, null, Integer.valueOf(R.color.igds_primary_text), null, Integer.valueOf(R.color.igds_secondary_text), null, null, sandbox.url, null, sandbox.description, true, true);
                }
                arrayList2.add(c54737OFo);
            }
            arrayList.add(c31335Dq0);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new C54737OFo(null, null, null, null, EnumC53237Nga.A09, null, null, Integer.valueOf(R.color.igds_error_or_destructive), null, null, null, null, AbstractC166997dE.A0q(context.getResources(), 2131958364), null, null, true, true));
            }
            arrayList.addAll(arrayList2);
            C35119FeM.A00(arrayList, true);
        }
        return arrayList;
    }

    public static final int toStringRes(IgServerHealth.Unhealthy.UnhealthyReason unhealthyReason) {
        int ordinal = unhealthyReason.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return 2131958355;
                    }
                    throw new RuntimeException();
                }
                return 2131958354;
            }
            return 2131958356;
        }
        return 2131958353;
    }

    public static final int toStringRes(IgServerHealth igServerHealth) {
        if (igServerHealth instanceof IgServerHealth.CheckingHealth) {
            return 2131958346;
        }
        if (igServerHealth instanceof IgServerHealth.Healthy) {
            return 2131958345;
        }
        if (igServerHealth instanceof IgServerHealth.Unhealthy) {
            return toStringRes(((IgServerHealth.Unhealthy) igServerHealth).errorStatus);
        }
        throw new RuntimeException();
    }

    public static final int toStringRes(CorpnetStatus corpnetStatus) {
        int ordinal = corpnetStatus.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                if (ordinal == 0) {
                    return 2131958340;
                }
                throw new RuntimeException();
            }
            return 2131958341;
        }
        return 2131958339;
    }

    public static final int toStringRes(SandboxType sandboxType) {
        int ordinal = sandboxType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return 2131958361;
                    }
                    throw new RuntimeException();
                }
                return 2131958360;
            }
            return 2131958358;
        }
        return 2131958362;
    }
}
