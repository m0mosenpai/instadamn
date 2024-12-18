package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.V8w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68066V8w extends C17T implements XGK {
    public User A00;

    @Override // X.XGK
    public final User AdB() {
        return this.A00;
    }

    @Override // X.XGK
    public final URL F0E(C1DY c1dy) {
        User user;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-309882753, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) c1dy.A00(A01);
                String A0i = A0i(-168253766);
                String A0j = A0j(1677107689);
                String A0i2 = A0i(-1549938746);
                String A0i3 = A0i(1047508433);
                String A0i4 = A0i(-209971210);
                Long A0L = A0L(-1298761629);
                return new URL(user, getOptionalBooleanValueByHashCode(-588909), getOptionalBooleanValueByHashCode(121133918), getOptionalBooleanValueByHashCode(-2069450039), A0L, A0i, A0j, A0i2, A0i3, A0i4, A0i(-132220081), A0X(), A0i(-2115337775));
            }
        }
        user = null;
        String A0i5 = A0i(-168253766);
        String A0j2 = A0j(1677107689);
        String A0i22 = A0i(-1549938746);
        String A0i32 = A0i(1047508433);
        String A0i42 = A0i(-209971210);
        Long A0L2 = A0L(-1298761629);
        return new URL(user, getOptionalBooleanValueByHashCode(-588909), getOptionalBooleanValueByHashCode(121133918), getOptionalBooleanValueByHashCode(-2069450039), A0L2, A0i5, A0j2, A0i22, A0i32, A0i42, A0i(-132220081), A0X(), A0i(-2115337775));
    }

    @Override // X.XGK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(VP2.A00(this), this);
    }

    @Override // X.XGK
    public final String Af0() {
        return A0i(-168253766);
    }

    @Override // X.XGK
    public final String As3() {
        return A0j(1677107689);
    }

    @Override // X.XGK
    public final String AxN() {
        return A0i(-1549938746);
    }

    @Override // X.XGK
    public final String AxO() {
        return A0i(1047508433);
    }

    @Override // X.XGK
    public final Long B2C() {
        return A0L(-1298761629);
    }

    @Override // X.XGK
    public final Boolean B7Y() {
        return getOptionalBooleanValueByHashCode(-588909);
    }

    @Override // X.XGK
    public final Boolean CGB() {
        return getOptionalBooleanValueByHashCode(-2069450039);
    }

    @Override // X.XGK
    public final Boolean CZx() {
        return getOptionalBooleanValueByHashCode(121133918);
    }

    @Override // X.XGK
    public final XGK EA4(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -309882753);
        return this;
    }

    @Override // X.XGK
    public final URL F0F(C1DV c1dv) {
        return F0E(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.XGK
    public final String getEndBackgroundColor() {
        return A0i(-209971210);
    }

    @Override // X.XGK
    public final String getStartBackgroundColor() {
        return A0i(-132220081);
    }

    @Override // X.XGK
    public final String getText() {
        return A0X();
    }

    @Override // X.XGK
    public final String getTextColor() {
        return A0i(-2115337775);
    }
}
