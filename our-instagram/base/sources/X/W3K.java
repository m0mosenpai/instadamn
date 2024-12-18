package X;

import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.LocationSharingPresenterState;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class W3K {
    public int A00;
    public long A01;
    public Address A02;
    public LiveLocationSession A03;
    public Location A04;
    public Location A05;
    public ImmutableList A06;
    public ImmutableList A07;
    public ImmutableList A08;
    public ImmutableList A09;
    public ImmutableList A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;

    public W3K(LocationSharingPresenterState locationSharingPresenterState) {
        locationSharingPresenterState.getClass();
        this.A06 = locationSharingPresenterState.A06;
        this.A04 = locationSharingPresenterState.A04;
        this.A01 = locationSharingPresenterState.A01;
        this.A03 = locationSharingPresenterState.A03;
        this.A02 = locationSharingPresenterState.A02;
        this.A0D = locationSharingPresenterState.A0D;
        this.A05 = locationSharingPresenterState.A05;
        this.A07 = locationSharingPresenterState.A07;
        this.A08 = locationSharingPresenterState.A08;
        this.A00 = locationSharingPresenterState.A00;
        this.A0B = locationSharingPresenterState.A0B;
        this.A09 = locationSharingPresenterState.A09;
        this.A0A = locationSharingPresenterState.A0A;
        this.A0C = locationSharingPresenterState.A0C;
    }

    public W3K() {
        this.A06 = ImmutableList.of();
        this.A07 = ImmutableList.of();
        this.A08 = ImmutableList.of();
        this.A00 = -1;
        this.A09 = ImmutableList.of();
        this.A0A = ImmutableList.of();
        this.A0C = "";
    }
}
