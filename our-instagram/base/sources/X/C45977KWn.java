package X;

/* renamed from: X.KWn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45977KWn extends AbstractC159137Bz {
    @Override // X.AbstractC159137Bz
    public final AbstractC160207Gg createCommandData() {
        C7FY c7fy = this.commandType;
        String A0R = AnonymousClass001.A0R(AnonymousClass001.A0D("\u200d", c7fy.A00), this.trigger);
        String str = this.description;
        if (str != null) {
            return new C7CF(this.loggingId, c7fy, 3, A0R, str, null, this.iconDrawableRes);
        }
        throw AbstractC166997dE.A0g();
    }
}
