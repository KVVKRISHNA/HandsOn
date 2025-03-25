import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsumerDeskComponent } from './consumer-desk.component';

describe('ConsumerDeskComponent', () => {
  let component: ConsumerDeskComponent;
  let fixture: ComponentFixture<ConsumerDeskComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ConsumerDeskComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ConsumerDeskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
