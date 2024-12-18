package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC25231BEo;
import X.AbstractC25235BEs;
import X.AnonymousClass001;
import X.C0YY;
import X.EnumC09460dv;
import X.InterfaceC16820sZ;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$3 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $key$inlined;
    public final /* synthetic */ Fragment $this_requiredArgument;

    /* renamed from: com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$3$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends C0YY implements InterfaceC16820sZ {
        public final /* synthetic */ String $key;
        public final /* synthetic */ Fragment $this_optionalArgument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, String str) {
            super(0);
            this.$this_optionalArgument = fragment;
            this.$key = str;
        }

        @Override // X.InterfaceC16820sZ
        public final Object invoke() {
            Object A0m;
            if (Serializable.class.isAssignableFrom(String.class)) {
                Fragment fragment = this.$this_optionalArgument;
                String str = this.$key;
                int i = Build.VERSION.SDK_INT;
                Bundle requireArguments = fragment.requireArguments();
                if (i >= 33) {
                    A0m = requireArguments.getSerializable(str, Object.class);
                } else {
                    A0m = AbstractC25228BEl.A11(requireArguments, str);
                }
            } else if (AbstractC25226BEj.A1a(String.class)) {
                A0m = AbstractC25231BEo.A0m(this.$this_optionalArgument, this.$key);
            } else {
                throw AbstractC25231BEo.A0i(this.$key);
            }
            if (!(A0m instanceof String)) {
                return null;
            }
            return A0m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$3(Fragment fragment, String str, String str2) {
        super(0);
        this.$this_requiredArgument = fragment;
        this.$key = str;
        this.$key$inlined = str2;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        Object A0n = AbstractC25235BEs.A0n(EnumC09460dv.A02, new AnonymousClass1(this.$this_requiredArgument, this.$key));
        if (A0n != null) {
            return A0n;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0R("Argument not found for ", this.$key$inlined));
    }
}
