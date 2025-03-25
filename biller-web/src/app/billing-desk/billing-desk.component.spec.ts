import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillingDeskComponent } from './billing-desk.component';

describe('BillingDeskComponent', () => {
  let component: BillingDeskComponent;
  let fixture: ComponentFixture<BillingDeskComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BillingDeskComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BillingDeskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
